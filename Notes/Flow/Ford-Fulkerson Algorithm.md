---
tags:
  - Example
  - Flow
  - Complexity
---
The _Ford-Fulkerson Algorithm_ is a [[Greedy|greedy]] algorithm for calculating [[Maximum Flow|maximum flow]] in a [[Flow Network|flow network]].

> [!note]
> The central idea behind the algorithm is as follows:
> As long as **any path** exists from the **source node** to the **sink node** that has [[Residual Capacity|residual capacity]], we send [[Flow Network|flow]] along one of the paths.
> 
> If **more** than **one path** is needed, these are known as [[Augmenting Path|augmenting paths]].

---
### Complexity
The **complexity values** for the _Ford-Fulkerson Algorithm_ are:

| Aspect | Complexity     |
| ------ | -------------- |
| Time   | $O(\|V\| E^2)$ |
| Space  | $O(V)$         |

---

![[Maximum Flow#Example]]