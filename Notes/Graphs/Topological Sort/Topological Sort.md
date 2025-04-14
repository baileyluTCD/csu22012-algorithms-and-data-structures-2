A _topological sort_ is a **linear ordering** of **vertices** for a **directed tree**, such that, for each vertex $V$ connected to $U$, $V$ comes **before** $U$ in the ordering.

> [!question] Usage
> This is useful for modelling things like some tasks where one must be finished before the other.

---
### Example
_Topologically sort_ this graph, resolving ties alphabetically:
![[Topological Sort Example.png]]

$A$ and $B$ are first and nothing connects to them so we can safely add them to the list:

> $[A, B]$

Next, $A$ and $B$ connect to $D$, $C$ and $E$, so we add them to the end, making sure to sort them alphabetically as per the question:

> $[A, B, C, D, E]$

$D$ and $E$ connect to $F$ which connects to $G$, which is the last node, giving us the completed _topological sort_:

> $[A, B, C, D, E, F, G]$