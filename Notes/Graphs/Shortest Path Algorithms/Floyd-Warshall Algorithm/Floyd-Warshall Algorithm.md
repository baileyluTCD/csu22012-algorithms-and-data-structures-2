---
tags:
  - Example
  - Shortest_Path_Algorithm
  - Complexity
---
The _Floyd-Warshall Algorithm_ is a method of finding the **shortest distance** between any pair of **vertices** in a **graph**.

With a given **start node** and **end node** with the goal of finding the shortest combination of **adjoining vertices**, we can simply narrow the problem by first recursively finding the **shortest distance** between all **intermediate vertices**, until we have a direct connection.

> [!info]
> The _Floyd-Warshall Algorithm_ can be used on graphs with both **undirected** and **directed** edges as well as **positive** and **negative** edge weights, similar to the [[Bellman-Ford Algorithm]].

---
### Complexity
The **complexity values** for the _Floyd-Warshall Algorithm_ are:

| Aspect | Complexity |
| ------ | ---------- |
| Time   | $O(V^3)$   |
| Space  | $O(V^2)$   |

---
### Example
![[Floyd-Warshall Example.png]]

> With the above graph, find the **shortest path** between all the **pairs of vertices**.

---
Start with an $n$ by $n$ matrix $A^0$ where $n$ is the **number of vertices**:

| Matrix | $1$      | $2$      | $3$      | $4$      |
| ------ | -------- | -------- | -------- | -------- |
| $1$    | $0$      | $3$      | $\infty$ | $5$      |
| $2$    | $2$      | $0$      | $\infty$ | $4$      |
| $3$    | $\infty$ | $6$      | $0$      | $\infty$ |
| $4$    | $\infty$ | $\infty$ | $2$      | $0$      |

> [!note]
> Follow the following rules when creating this matrix:
> - If no direct connections at all exist, use $\infty$
> - If looking for the distance to the current node, use $0$
> - Otherwise, place the shortest combined distance

---
Now, create a matrix $A^1$ from $A^0$, leaving the **first row*** and **first column** as they were.

| Matrix | $1$      | $2$ | $3$      | $4$  |
| ------ | -------- | --- | -------- | ---- |
| $1$    | $0$      | $3$ | $\infty$ | $5$  |
| $2$    | $2$      | $0$ | $6$      | $4$  |
| $3$    | $\infty$ | $6$ | $0$      | $10$ |
| $4$    | $\infty$ | $8$ | $2$      | $0$  |

> [!note]
> Follow the following rules when updating an entry in the matrix $A^1$
> - If the sum of the distance from a **start vertex** through **another vertex** to a **destination vertex** is less than the current value for a given connection, replace it with this new smaller value.

---
Repeat this process to create $A^2$, leaving the **second row** and **second column** intact.

| Matrix | $1$ | $2$ | $3$ | $4$  |
| ------ | --- | --- | --- | ---- |
| $1$    | $0$ | $3$ | $7$ | $5$  |
| $2$    | $2$ | $0$ | $6$ | $4$  |
| $3$    | $8$ | $6$ | $0$ | $10$ |
| $4$    | $8$ | $8$ | $2$ | $0$  |

---
Continue for $A^3$ and $A^4$ and the **third/fourth row*** and **third/fourth column**.

| Matrix | $1$ | $2$ | $3$ | $4$  |
| ------ | --- | --- | --- | ---- |
| $1$    | $0$ | $3$ | $7$ | $5$  |
| $2$    | $2$ | $0$ | $6$ | $4$  |
| $3$    | $8$ | $6$ | $0$ | $10$ |
| $4$    | $8$ | $8$ | $2$ | $0$  |
