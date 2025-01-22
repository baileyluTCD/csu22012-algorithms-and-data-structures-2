_Insertion Sort_ is a [[Sorting|sorting algorithm]] based on finding the correct position for each item in the array

> [!example]
> Input:
> ```
> [1, 2, 1, 1, 2, 3, 4, 5]
> ```
> Iteration 0:
> ```
> [1, 2, 1, 1, 2, 3, 4, 5] -> $1$ does not need to be moved as it is not greater than any item in the array
> ```
>  Iteration 1:
> ```
> [1, 1, 1, 2, 2, 3, 4, 5] -> $2$ was moved to where it was less than the next element
> ```
> This array is sorted hence we do not need to continue.

---
### Pseudo Code
```javascript
function insertionSort(arr) {
	for i in range(s, arr.length - 1) {
		comst j = i - 1;
		while j > 0 && arr[j - 1] > arr[j] {
			swap(a[j], arr[j - 1]);
			j--;
		}
	}
}
```

#### Analysis:
$T(N) = O(n^2)$