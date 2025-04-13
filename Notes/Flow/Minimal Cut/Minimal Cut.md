---
aliases:
  - Min-Cut
tags:
  - Example
  - Flow
---
A _minimum cut_ of a **graph** is a **specific partitioning** of the graph's vertices into **two disjoint subsets** that is minimal in some metric.

---
### Example
![[Minimum Cut Image.png]]

> Find the _minimal cut_ of this graph with an input [[Flow Network|flow]] of $6$

In order to find a _minimal cut_, we must first find the minimum [[Flow Network|flow]] path through the graph.

![[Minimum Cut Image 2.png]]
![[Minimum Cut Image 3.png]]
![[Minimum Cut Image 4.png]]
![[Minimum Cut Image 5.png]]

Here, we can see that the final minimum cut divides the [[Flow Network|flow network]] into two disjoint sets:
- $[s, A, B, C, t]$
- $[D]$

![[Minimum Cut Image 6.png]]

