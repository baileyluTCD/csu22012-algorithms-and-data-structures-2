---
tags:
  - Radix_Sorting_Algorithm
  - Example
aliases:
  - MSD Sort
---
_Most Significant Digit Sort_ is an implementation of [[Radix Sort|radix sort]] that starts from the **most significant digit** in a integer - i.e if taken from $1,2,3,4$, _Most Significant Digit Sort_ would start from $1$.

> [!question] When to use
> _MSD Sort_ is fastest when sorting an array of entirely random strings

---
### Example
Input: `[170, 45, 75, 90, 2, 802, 2, 66]`

> Sort this array using _Most Significant Digit Sort_.

#### 1. Most Significant Digits:
`[170, 045, 075, 090, 002, 802, 002, 066]`
` ^    ^    ^    ^    ^    ^    ^    ^`

`[{045, 075, 090, 002, 002, 066}, {170}, {802}]`

> [!note]
> $170$ and $802$ can be considered complete at this stage since we go down a most significant bit and their buckets only have $1$ element.
#### 2. Next Most Significant Digits:
`[{45, 75, 90, 02, 02, 66}, 170, 802]`
`  ^   ^   ^   ^   ^   ^`

`[{02, 02}, {45}, {66}, {75}, {90}, 170, 802]`
#### 3. Next Most Significant Digits:
`[{2, 2}, 45, 66, 75, 90, 170, 802]`
`  ^  ^`

Output: `[2, 2, 45, 66, 75, 90, 170, 802]`



