---
tags:
  - Example
  - Shortest_Path_Algorithm
  - Complexity
---
_Dijkstra's Algorithm_ is a method of finding the **shortest distance** from **any node** on a graph to **all other nodes**.

Starting with a **given node**, expand iteratively to it's **neighbours** and maintain a **table of minimum distances**, updating every time a **shorter path** is found.

A node is considered **closed** when it's shortest path has been found.

> [!info]
> _Dijkstra's Algorithm_ is **faster** than the [[Bellman-Ford Algorithm]] with an $O(E \log V)$ runtime, however it isn't capable of handling as much cases, such as **negative edge weights**. See [[Bellman-Ford Algorithm#Handling negative weights|the handling negative weights section]] for more.

---
### Complexity
The **complexity values** for _Dijkstra's Algorithm_ are:

| Aspect | Complexity         |
| ------ | ------------------ |
| Time   | $O((V + E) log V)$ |
| Space  | $O(V)$             |


---
### Example
Starting with `a` and using alphabetical order in case of ties:

![[Dijkstra's Algorithm Image 1.png]]

| Node | Distance from `a` | Closed  | Path |
| ---- | ----------------- | ------- | ---- |
| `a`  | $0$               | `true`  | `aa` |
| `b`  |                   | `false` |      |
| `c`  |                   | `false` |      |
| `d`  |                   | `false` |      |
| `e`  |                   | `false` |      |
| `f`  |                   | `false` |      |
| `g`  |                   | `false` |      |
| `h`  |                   | `false` |      |
| `i`  |                   | `false` |      |
| `j`  |                   | `false` |      |
 
---
![[Dijkstra's Algorithm Image 2.png]]

| Node | Distance from `a` | Closed  | Path |
| ---- | ----------------- | ------- | ---- |
| `a`  | $0$               | `true`  | `aa` |
| `b`  | $4$               | `true`  | `ab` |
| `c`  | $6$               | `false` | `ac` |
| `d`  | $7$               | `false` | `ad` |
| `e`  | $5$               | `false` | `ae` |
| `f`  |                   | `false` |      |
| `g`  |                   | `false` |      |
| `h`  |                   | `false` |      |
| `i`  |                   | `false` |      |
| `j`  | $1$               | `true`  | `aj` |
 
---
![[Dijkstra's Algorithm Image 3.png]]

| Node | Distance from `a` | Closed  | Path  |
| ---- | ----------------- | ------- | ----- |
| `a`  | $0$               | `true`  | `aa`  |
| `b`  | $4$               | `true`  | `ab`  |
| `c`  | $6$               | `true`  | `ac`  |
| `d`  | $4$               | `true`  | `ajd` |
| `e`  | $5$               | `true`  | `ae`  |
| `f`  | $9$               | `false` | `aef` |
| `g`  |                   | `false` |       |
| `h`  | $8$               | `false` | `aeh` |
| `i`  | $10$              | `false` | `aji` |
| `j`  | $1$               | `true`  | `aj`  |

---
![[Dijkstra's Algorithm Image 4.png]]

| Node | Distance from `a` | Closed | Path   |
| ---- | ----------------- | ------ | ------ |
| `a`  | $0$               | `true` | `aa`   |
| `b`  | $4$               | `true` | `ab`   |
| `c`  | $6$               | `true` | `ac`   |
| `d`  | $4$               | `true` | `ajd`  |
| `e`  | $5$               | `true` | `ae`   |
| `f`  | $9$               | `true` | `aef`  |
| `g`  | 16                | `true` | `aefg` |
| `h`  | $8$               | `true` | `aeh`  |
| `i`  | $10$              | `true` | `aji`  |
| `j`  | $1$               | `true` | `aj`   |
