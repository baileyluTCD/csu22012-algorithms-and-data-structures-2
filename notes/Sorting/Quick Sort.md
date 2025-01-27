_Quick Sort_ is a [[Sorting|sorting algorithm]] based on breaking the array into sections around a pivot and sorting the sections recursively.

> [!example]
> Input:
> ```
> [1, 2, 1, 1, 2, 3, 4, 5]
> ```
> ```
> [1, 2, 1, 1, 2, 3, 4, 5] -> Select a random pivot in the array
>
> [1, 2, 1, 1, {2}, 3, 4, 5] -> Move everything less than the pivot to one side and everything greater to the other
>
> [1, 2, 1, 1, {2}, 3, 4, 5] -> Call quick sort again on each side to produce a sorted array:
>
> quickSort([1, 2, 1, 1]) <> 2 <> quickSort([3, 4, 5])
>
> [1, 1, 1, 2] <> 2 <> [3, 4, 5] -> arrays returned are sorted
> [1, 1, 1, 2] <> 2 <> [3, 4, 5] -> arrays returned are sorted
> [1, 1, 1, 2, 2, 3, 4, 5] -> recombine array
> ```

---
### Pseudo Code
```elixir
def quicksort([]), do: []
def quicksort([pivot|t]) do
	quicksort(for x <- t, x < pivot, do: x)
	++ [pivot] ++
	quicksort(for x <- t, x >= pivot, do: x)
end
```
#### Analysis:
$T(N) = O(n^2)$