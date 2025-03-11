---
tags:
  - Example
  - Sorting_Algorithm
---
_Merge Sort_ is a [[Sorting|sorting algorithm]] based on merging two **sorted** arrays to produce an output

> [!example]
> Input:
> ```
> [2, 3, 5, 28]
> [6, 7, 8, 9]
> ```
>
> Iteration 0:
> ```
> [2, 3, 5, 28]
> [6, 7, 8, 9]
>
> 2 < 6
> 
> Out: [2]
>
> ```
> Iteration 1:
> ```
> [3, 5, 28]
> [6, 7, 8, 9]
>
> 3 < 6
> 
> Out: [2, 3]
> ```
> 
> Iteration 2:
> ```
> [5, 28]
> [6, 7, 8, 9]
>
> 5 < 6
> 
> Out: [2, 3, 5]
> ```
> ... 
> Iteration 3:
> ```
> [28]
> [6, 7, 8, 9]
>
> 6 > 28
> 
> Out: [2, 3, 5, 6]
> ```
> ... 
> Iteration 7:
> ```
> []
> []
> 
> Out: [2, 3, 5, 6, 7, 8, 9, 28]
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
_Merge Sort_ **is** a [[Stable Sorting Algorithm]].