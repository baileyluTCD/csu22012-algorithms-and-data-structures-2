---
tags:
  - Sorting_Algorithm
  - Complexity
aliases:
  - Bucket Sort
  - Digital Sort
---
_Radix [[Sorting|Sort]]_ is a [[Sorting|sorting]] algorithm that works without any comparison. Instead it works by creating buckets and distributing the elements into them with an [[Key Indexed Counting|assigned key]].

_Radix [[Sorting|Sort]]_ can be implemented in two ways:
- [[Least Significant Digit Sort]]
- [[Most Significant Digit Sort]]


---
### Complexity
The **complexity values** for the _Radix [[Sorting|Sort]]_ are:

| Aspect | Complexity    |
| ------ | ------------- |
| Time   | $O(d(n + b))$ |
| Space  | $O(n + b)$    |

> [!question] Where:
> - $d$ is the maximum number of digits
> - $b$ is the base of the number system used
> - $n$ is the length of the list to be sorted
