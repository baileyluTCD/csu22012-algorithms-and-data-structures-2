---
tags:
  - Example
---
_Tail Call Recursion_ is a special form of [[Top Down Algorithm|recursion]] where the function recurring is the last action taken in the function.

```java
static void myFunction(int x) {
	if (x < 500)
		x -= 10;

	myFunction(x);
}
```

Because we know for a fact the **current variables** in the **stack frame** will not be **read** or **written to** again, we can reuse the **same storage space** for the next call of the function, **without allocating** a new stack frame.

This is a common optimization in **functional programming languages** like [elixir](https://elixir-lang.org/) where recursion is the primary method of iterating through a data structure:

```elixir
def has_x?(x, []), do: false
def has_x?(x, [head | list]) do
	if x == head do
	  true
	else
	  has_x?(x, list)
	end
end
```
