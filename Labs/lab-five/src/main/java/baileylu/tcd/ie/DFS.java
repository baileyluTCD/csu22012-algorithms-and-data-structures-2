import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DFS {
    private boolean[] marked; // marked[v] = is there an s-v path?
    private int[] edgeTo; // edgeTo[v] = last edge on s-v path
    private final int s; // source vertex

    /**
     * Computes a path between {@code s} and every other vertex in graph {@code G}.
     * 
     * @param G the graph
     * @param s the source vertex
     * @throws IllegalArgumentException unless {@code 0 <= s < V}
     */
    public DFS(GraphActors G, int s) {
        this.s = s;
        edgeTo = new int[G.V()];
        marked = new boolean[G.V()];
        dfs(G, s);
    }

    // depth first search from v
    private void dfs(GraphActors G, int v) {
        marked[v] = true;
        for (Actor a : G.adj(v)) {
            int w = G.actorToIndex(a);
            if (!marked[w]) {
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
    }

    /**
     * Is there a path between the source vertex {@code s} and vertex {@code v}
     */
    public boolean hasPathTo(int v) {
        return marked[v];
    }

    /**
     * Returns a path between the source vertex {@code s} and vertex {@code v}, or
     * {@code null} if no such path.
     * 
     * @param v the vertex
     * @return the sequence of vertices on a path between the source vertex
     *         {@code s} and vertex {@code v}, as an Iterable
     */
    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v))
            return null;
        Stack<Integer> path = new Stack<Integer>();
        for (int x = v; x != s; x = edgeTo[x])
            path.push(x);
        path.push(s);
        return path;
    }

    public static void main(String[] args) {

        // 1) Create 20 sample Actor objects
        Actor leonardo = new Actor("Leonardo DiCaprio", "1974-11-11", "American", 48);
        Actor kate = new Actor("Kate Winslet", "1975-10-05", "British", 47);
        Actor tomH = new Actor("Tom Hanks", "1956-07-09", "American", 66);
        Actor joseph = new Actor("Joseph Gordon-Levitt", "1981-02-17", "American", 42);
        Actor tomHardy = new Actor("Tom Hardy", "1977-09-15", "British", 45);
        Actor cillian = new Actor("Cillian Murphy", "1976-05-25", "Irish", 46);
        Actor marion = new Actor("Marion Cotillard", "1975-09-30", "French", 47);
        Actor brad = new Actor("Brad Pitt", "1963-12-18", "American", 59);
        Actor angelina = new Actor("Angelina Jolie", "1975-06-04", "American", 47);
        Actor morgan = new Actor("Morgan Freeman", "1937-06-01", "American", 85);
        Actor matt = new Actor("Matt Damon", "1970-10-08", "American", 52);
        Actor ben = new Actor("Ben Affleck", "1972-08-15", "American", 50);
        Actor jennifer = new Actor("Jennifer Lawrence", "1990-08-15", "American", 32);
        Actor christian = new Actor("Christian Bale", "1974-01-30", "British", 49);
        Actor anne = new Actor("Anne Hathaway", "1982-11-12", "American", 40);
        Actor meryl = new Actor("Meryl Streep", "1949-06-22", "American", 73);
        Actor natalie = new Actor("Natalie Portman", "1981-06-09", "Israeli-American", 41);
        Actor scarlett = new Actor("Scarlett Johansson", "1984-11-22", "American", 38);
        Actor robert = new Actor("Robert Downey Jr.", "1965-04-04", "American", 57);
        Actor emma = new Actor("Emma Stone", "1988-11-06", "American", 34);

        // 2) Put them into a List
        List<Actor> actorList = Arrays.asList(
                leonardo, kate, tomH, joseph, tomHardy, cillian, marion,
                brad, angelina, morgan, matt, ben, jennifer, christian,
                anne, meryl, natalie, scarlett, robert, emma);

        // Build the GraphActors using your constructor that takes a List<Actor>
        GraphActors g = new GraphActors(actorList);

        // Add edges to represent (for example) co-starring

        // Titanic: Leonardo <-> Kate
        g.addEdge(leonardo, kate);

        // Catch Me If You Can: Leonardo <-> Tom Hanks
        g.addEdge(leonardo, tomH);

        // Inception: Leonardo <-> JGL, Tom Hardy, Cillian, Marion
        g.addEdge(leonardo, joseph);
        g.addEdge(leonardo, tomHardy);
        g.addEdge(leonardo, cillian);
        g.addEdge(leonardo, marion);

        g.addEdge(joseph, tomHardy);
        g.addEdge(joseph, cillian);
        g.addEdge(joseph, marion);

        g.addEdge(tomHardy, cillian);
        g.addEdge(tomHardy, marion);

        g.addEdge(cillian, marion);

        // Inception side co-stars: JGL, Tom Hardy, Cillian, Marion
        g.addEdge(joseph, tomHardy);
        g.addEdge(joseph, cillian);
        g.addEdge(joseph, marion);

        g.addEdge(tomHardy, cillian);
        g.addEdge(tomHardy, marion);

        g.addEdge(cillian, marion);

        // The Revenant: Leonardo <-> Tom Hardy
        g.addEdge(leonardo, tomHardy);
        g.addEdge(tomHardy, leonardo);

        // Mr. & Mrs. Smith: Brad <-> Angelina
        g.addEdge(brad, angelina);
        g.addEdge(angelina, brad);

        // Wanted: Angelina <-> Morgan
        g.addEdge(angelina, morgan);
        g.addEdge(morgan, angelina);

        // Se7en: Brad <-> Morgan
        g.addEdge(brad, morgan);
        g.addEdge(morgan, brad);

        // Ocean's Eleven (part of the franchise): Brad <-> Matt
        g.addEdge(brad, matt);
        g.addEdge(matt, brad);

        // Good Will Hunting: Matt <-> Ben
        g.addEdge(matt, ben);
        g.addEdge(ben, matt);

        // American Hustle (fictional cross): Jennifer <-> Christian
        g.addEdge(jennifer, christian);
        g.addEdge(christian, jennifer);

        // The Dark Knight Rises: Christian <-> Tom Hardy, Christian <-> Marion
        g.addEdge(christian, tomHardy);
        g.addEdge(christian, marion);

        g.addEdge(tomHardy, marion);

        // The Devil Wears Prada: Anne <-> Meryl
        g.addEdge(anne, meryl);
        g.addEdge(meryl, anne);

        // Lucy: Scarlett <-> Morgan
        g.addEdge(scarlett, morgan);
        g.addEdge(morgan, scarlett);

        // Avengers (etc.): Robert <-> Scarlett
        g.addEdge(robert, scarlett);
        g.addEdge(scarlett, robert);

        int s = g.actorToIndex(cillian);

        DFS dfs = new DFS(g, s);

        for (int v = 0; v < g.V(); v++) {
            if (dfs.hasPathTo(v)) {
                System.out.println(g.indexToActor(s).getName() + " to " + g.indexToActor(v).getName());
                for (int x : dfs.pathTo(v)) {
                    if (x == s)
                        System.out.println(g.indexToActor(x).getName());
                    else
                        System.out.println("-" + g.indexToActor(x).getName());
                }
                System.out.println();
            } else {
                System.out.println(
                        g.indexToActor(s).getName() + " to " + g.indexToActor(v).getName() + ":  not connected\n");
            }
        }
    }

}
