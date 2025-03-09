---
tags:
  - Example
  - Sorting_Algorithm
---
_Selection Sort_ is a [[Sorting|sorting algorithm]] based on a swapping with the minimum value, then considering that minimum value sorted and recursively focusing on the rest of the array

> [!example]
> Input:
> ```
> [1, 2, 1, 1, 2, 3, 4, 5]
> Iteration 0:
> ```
> ```
> [1, 2, 1, 1, 2, 3, 4, 5] -> Nothing is smaller than $1$ so we don't swap and consider $1$ as sorted
> ```
> Iteration 2:
> ```
> [2, 1, 1, 2, 3, 4, 5] -> Multiple numbers are smaller than 2 so we swap them to the start
> [1, 2, 2, 2, 3, 4, 5] -> Array is now sorted
> ```
---
### Pseudo Code
```javascript
function selectionSort(arr) {
	if (arr.length <= 1)
		return arr;

	const x = arr[0];
	for i in range(s, arr.length - 1) {
		if (x > arr[i]) {
			swap(x, arr[i])
			let next = slice(arr, 1, arr.length);
			return selectionSort(next);
		}
	}
}
```
#### Analysis:
$T(N) = O(n^2)$
