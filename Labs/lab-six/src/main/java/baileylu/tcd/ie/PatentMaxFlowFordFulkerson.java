package baileylu.tcd.ie;

import java.util.*;

/**
 * Fordâ€“Fulkerson (BFS) to compute max flow in a PatentFlowNetwork.
 */
public class PatentMaxFlowFordFulkerson {

    private double value; // total max flow
    private boolean[] marked;
    private PatentFlowNetwork.FlowEdge[] edgeTo;

    /**
     * Run Fordâ€“Fulkerson from a given source Patent to a sink Patent.
     */
    public PatentMaxFlowFordFulkerson(PatentFlowNetwork G, Patent source, Patent sink) {
        int s = G.getPatentIndex().getId(source);
        int t = G.getPatentIndex().getId(sink);

        value = 0.0;
        // Repeatedly find augmenting paths via BFS
        while (true) {
            double bottleneck = bfs(G, s, t);
            if (bottleneck == 0) {
                break; // no augmenting path
            }
            value += bottleneck;

            // Walk back from target to source, adding flow along that path
            int v = t;
            while (v != s) {
                PatentFlowNetwork.FlowEdge e = edgeTo[v];
                // If e.from() == prev vertex, we push flow forward
                // If e.to() == v, we do e.addResidualFlowTo(v, bottleneck)
                e.addResidualFlowTo(v, bottleneck);
                v = e.from();
            }
        }
    }

    /**
     *
     */
    private double bfs(PatentFlowNetwork G, int s, int t) {
        marked = new boolean[G.V()];
        edgeTo = new PatentFlowNetwork.FlowEdge[G.V()];
        Arrays.fill(edgeTo, null);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        marked[s] = true;

        while (!queue.isEmpty()) {
            int v = queue.poll();

            for (PatentFlowNetwork.FlowEdge e : G.adj(v)) {
                int w = e.to();
                // If there's residual capacity and w not visited, we can go there
                if (!marked[w] && e.residualCapacityTo(w) > 0) {
                    edgeTo[w] = e; // remember how we got to w
                    marked[w] = true;
                    queue.offer(w);

                    // If we reached target, compute bottleneck by walking edgeTo[] back up
                    if (w == t) {
                        double bottleneck = Double.POSITIVE_INFINITY;
                        int x = t;
                        while (x != s) {
                            PatentFlowNetwork.FlowEdge edge = edgeTo[x];
                            bottleneck = Math.min(bottleneck, edge.residualCapacityTo(x));
                            x = edge.from();
                        }
                        return bottleneck;
                    }
                }
            }
        }

        // no path found
        return 0.0;
    }

    /**
     * Returns the max flow value found
     */
    public double value() {
        return value;
    }
}
