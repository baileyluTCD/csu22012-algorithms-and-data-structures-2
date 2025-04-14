---
tags:
  - Radix_Sorting_Algorithm
  - Example
aliases:
  - LSD Sort
---
_Least Significant Digit Sort_ is an implementation of [[Radix Sort|radix sort]] that starts from the **least significant digit** in a integer - i.e if taken from $1,2,3,4$, _Least Significant Digit Sort_ would start from $4$.

> [!question] When to use
> _LSD Sort_ is fastest when sorting short fixed length strings.

---
### Example
Input: `[170, 45, 75, 90, 2, 802, 2, 66]`

> Sort this array using _Least Significant Digit Sort_.

#### 1. Least Significant Digits:
`[170, 45, 75, 90, 2, 802, 2, 66]`
`   ^   ^   ^   ^  ^    ^  ^   ^`

`[{170, 90}, {2, 802, 2}, {45, 75}, {66}]`
#### 2. Next Least Significant Digits:
`[{170, 90}, {02, 802, 02}, {45, 75}, {66}]`
`   ^   ^     ^    ^   ^     ^   ^     ^`

`[{02, 802, 02}, {45}, {66}, {170, 75}, {90}]`
#### 3. Next Least Significant Digits:
`[{002, 802, 002}, {045}, {066}, {170, 075}, {090}]`
`  ^    ^    ^      ^      ^      ^    ^      ^`

`[{002, 002, 045, 066, 075, 090}, {170}, {802}]`

Output: `[2, 2, 45, 66, 75, 90, 170, 802]`