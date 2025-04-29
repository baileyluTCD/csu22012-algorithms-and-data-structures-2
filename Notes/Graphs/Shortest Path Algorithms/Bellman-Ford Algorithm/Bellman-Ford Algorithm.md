---
tags:
  - Example
  - Shortest_Path_Algorithm
  - Complexity
---
The _Bellman-Ford Algorithm_ is a method of finding the **shortest distance** from **any node** on a graph to **all other nodes**.

> [!info]
> Compared to [[Dijkstra's Algorithm]] it is **slower** with an $O(VE)$ runtime, however it is more **versatile**, for example, it is able to handle cases where **edge weights** are **negative** or to be implemented in a **distributed manner**. See [[Bellman-Ford Algorithm#Handling negative weights|the handling negative weights section]] for more.

Similar to [[Dijkstra's Algorithm]], the _Bellman-Ford Algorithm_ proceeds by recursively expanding to each **node's neighbours** and maintaining a **table of approximations**, however **instead** of a priority queue like approach, the _Bellman-Ford Algorithm_ iterates over **every vertex in the graph**.

---
### Complexity
The **complexity values** for the _Bellman-Ford Algorithm_ are:

| Aspect | Complexity |
| ------ | ---------- |
| Time   | $O(VE)$    |
| Space  | $O(V)$     |

---
### Handling negative weights
The _Bellman-Ford Algorithm_ is capable of detecting **negative cycles**, which is important because if a **negative cycle** exists, then there is **no shortest path**, as **looping** around the cycle makes the **walk cheaper**.

> [!example]
> ![[Negative Cycle Image.png]]
> 
> Here, **no shortest path** exists because simply looping around `1` -> `2` -> `3` repeatedly will result in a lower total weight. (i.e. $3+2-6 = -1$)

---
### Example
Starting with this graph at node $A$, **find the shortest paths**. Note the presence of a **negative weight**.
![[Bellman-Ford Example Image 1.png]]

#### Step 1
![[Bellman-Ford Example Image 2.png]]

Assign the weight $0$ to $A$, the starting node and $\infty$ to all other nodes.
#### Step 2
![[Bellman-Ford Example Image 3.png]]

Visit each edge and relax the path distances if they are inaccurate.
#### Step 3
![[Bellman-Ford Example Image 4.png]]

Repeat this at most $V$ times, updating the distance if a smaller path from a neighbouring vertex exists.