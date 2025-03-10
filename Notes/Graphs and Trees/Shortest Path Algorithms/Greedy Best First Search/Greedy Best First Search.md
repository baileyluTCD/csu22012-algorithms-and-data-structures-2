---
tags:
  - Example
  - Shortest_Path_Algorithm
---
A _[[Greedy]] [[Best First Search]]_ is a specific, **defined algorithm** which takes a [[Greedy]] approach to a [[Best First Search]].

This is often a better choice than [[Dijkstra's Algorithm]] or similar algorithms which evaluate the distance to every node if you just need the distance between two specific nodes.

> [!info]
> To run a _[[Greedy]] [[Best First Search]]_:
> 1. Use the [[Best First Search|heuristic function]] provided to get an estimate of each path's cost.
> 2. Expand the path with the lowest expected cost ([[Greedy|greedily]]).
> 3. Repeat this until the goal is reached, producing an **approximation** for the shortest path.

---
### Example
Find the **shortest path** for the following graph, using the _[[Greedy]] [[Best First Search]]_ algorithm.

> [!note]
>  The green numbers above the nodes indicated the value returned by the [[Best First Search|heuristic function]].

![[Greedy Best First Search Example 1.png]]

---
![[Greedy Best First Search Example 2.png]]
Here, the choices we have are:

| Node | Distance |
| ---- | -------- |
| $D$  | $35$     |
| $C$  | $25$     |
| $B$  | $32$     |
Clearly, $C$ has the smallest [[Best First Search|heuristic function]] returned value ($25$), hence we move to $C$.

---
![[Greedy Best First Search Example 3.png]]
Here, the choices we have are:

| Node | Distance |
| ---- | -------- |
| $F$  | $17$     |
| $E$  | $19$     |
Clearly, $F$ has the smallest [[Best First Search|heuristic function]] returned value ($17$), hence we move to $F$.

---
![[Greedy Best First Search Example 4.png]]
Finally, $F$ connects directly to $G$, the goal node, hence we can complete our shortest path.