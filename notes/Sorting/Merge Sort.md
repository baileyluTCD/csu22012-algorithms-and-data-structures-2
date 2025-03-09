---
tags:
  - Example
  - Sorting_Algorithm
---
_Merge Sort_ is a [[Sorting|sorting algorithm]] based on merging two sorted arrays to produce an output

> [!example]
> Input:
> ```
> [23, 2, 3, 5, 28]
> [25, 7, 6, 8, 9]
> ```
>
> Iteration 0:
> ```
> [23, 2, 3, 5, 28]
> [25, 7, 6, 8, 9]
>
> 23 < 25
> 
> Out: [23]
>
> ```
> Iteration 1:
> ```
> [2, 3, 5, 28]
> [25, 7, 6, 8, 9]
>
> 2 < 25
> 
> Out: [2, 23]
> ```
> 
> Iteration 2:
> ```
> [3, 5, 28]
> [25, 7, 6, 8, 9]
>
> 3 < 25
> 
> Out: [2, 3, 23]
> ```
> ... 
> Iteration 5:
> ```
> [3, 5, 28]
> [25, 7, 6, 8, 9]
>
> 28 > 25
> 
> Out: [2, 3, 5, 23, 25]
> ```
> ...

---
### Pseudo Code
```elixir
def merge_sort(list) when length(list) <= 1, do: list
def merge_sort(list) do
	{left, right} = Enum.split(list, div(length(list), 2))
	:lists.merge(merge_sort(left), merge_sort(right))
end
```
#### Analysis:

| Case             | Condition                                             |
| ---------------- | ----------------------------------------------------- |
| **Best Case**    | $\Omega(n \log n)$ if the array is already sorted     |
| **Average Case** | $\Theta(n \log n)$ when the array is randomly ordered |
| **Worse Case**   | $O(n \log n)$ if the array is in reverse order        |

---
### Stability
_Merge Sort_ **is** a [[stable sorting algorithm]].