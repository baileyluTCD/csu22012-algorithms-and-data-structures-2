---
tags:
  - Example
  - Shortest_Path_Algorithm
---
The _A*_ algorithm is a popular [[best first search]] algorithm for finding the **shortest path** between **two known nodes**.

> [!info]
> The _A*_ algorithm uses two pieces of information in order to make an **estimate** about how optimal a given node is:
> - $g(x)$ -> The cost from the start node to node $x$.
> - $h(x)$ -> The [[Best First Search|heuristic function]] describing the estimated cost to the goal node.
>   
> This produces $f(x) = g(x) + h(x)$ which _A*_ attempts to find the minimal value of.

> [!question] Process
> The _A*_ algorithm follows the following process:
> 1. Add the neighbours of the **starting node** to the **open set**/**frontier**.
> 2. Select the member of the **open set**/**frontier** with the lowest $f(x)$ value, and expand it's neighbours, adding them to the **open set**/**frontier**.
> 3. Continue until the **goal node** is reached.

---
### Example
Run the _A*_ algorithm on the following graph:

![[A* Example 1.png]]

> [!note]
> The result of $h(x)$, the [[Best First Search|heuristic function]], is marked in gold below each node.
> Edge weights are in black next to each edge.

---
![[A* Example 2.png]]

Here, the **open set**/**frontier** was:

| Node | $h(x)$ | $g(x)$ | $f(x) = g(x) + h(x)$ |
| ---- | ------ | ------ | -------------------- |
| $b$  | $12$   | $4$    | $16$                 |
| $c$  | $11$   | $3$    | $14$                 |

---
![[A* Example 3.png]]

Here, the **open set**/**frontier** was:

| Node | $h(x)$ | $g(x)$ | $f(x) = g(x) + h(x)$ |
| ---- | ------ | ------ | -------------------- |
| $b$  | $12$   | $4$    | $16$                 |
| $d$  | $6$    | $10$   | $16$                 |
| $e$  | $4$    | $13$   | $17$                 |

---
![[A* Example 4.png]]

Here, the **open set**/**frontier** was:

| Node | $h(x)$ | $g(x)$ | $f(x) = g(x) + h(x)$ |
| ---- | ------ | ------ | -------------------- |
| $d$  | $6$    | $10$   | $16$                 |
| $e$  | $4$    | $13$   | $17$                 |
| $f$  | $11$   | $9$    | $18$                 |

---
![[A* Example 5.png]]

Here, the **open set**/**frontier** was:

| Node | $h(x)$ | $g(x)$ | $f(x) = g(x) + h(x)$ |
| ---- | ------ | ------ | -------------------- |
| $e$  | $4$    | $12$   | $16$                 |
| $f$  | $11$   | $9$    | $18$                 |

---
![[A* Example 6.png]]

Here, the **open set**/**frontier** was:

| Node | $h(x)$      | $g(x)$ | $f(x) = g(x) + h(x)$ |
| ---- | ----------- | ------ | -------------------- |
| $z$  | `goal node` | $17$   | $17$                 |
| $f$  | $11$        | $9$    | $18$                 |

Since the `goal node` is a member of the **open set**/**frontier** we just select it, and our shortest path is the one from $acdez$
