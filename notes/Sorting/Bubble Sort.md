---
tags:
  - Example
  - Sorting_Algorithm
---
_Bubble Sort_ is a [[Sorting|sorting algorithm]] based on a series of **comparison-exchange** operations.

> [!example]
> Input:
> ```
> [1, 2, 1, 1, 2, 3, 4, 5]
> ```
> Start at first index:
> ```
> [1, 2, 1, 1, 2, 3, 4, 5] -> 1 < 2: Do nothing
> ```
> Continue at second value:
> ```
> [1, 2, 1, 1, 2, 3, 4, 5] -> 2 > 1: Swap 2 and 1
> [1, 1, 2, 1, 2, 3, 4, 5] -> 2 > 1: Swap 2 and 1
> ```
> Continue to final index:
> ```
> [1, 1, 1, 2, 2, 3, 4, 5]
> ```
> Do one final pass over array to verify sorting, if not sorted re run bubble sort

---
### Pseudo Code
```javascript
function bubbleSort(arr) {
	for i in range(s, arr.length - 1) {
		for j in range(s, arr.length - 1) {
			if A[j] > A[j + 1] {
				swap(A[j], A[j + 1]);	
			}	
		}
	}
}
```

#### Analysis:
$T(N) = O(n^2)$

---
### Stability
_Bubble Sort_ **is** a [[stable sorting algorithm]].