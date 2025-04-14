A _Ternary Search [[Trie]]_ is a variant of a [[Trie|trie]] where:
- Values are stored **directly in the nodes** instead of keys
- Each node has $3$ children - **smaller(left)**, **equal(middle)**, **larger(right)**

![[Ternary Search Trie Image.png]]

> [!note]
> A [[Ternary Search Trie]] may be better than a [[Trie]] in many cases as it is **more memory efficient**, only taking $3$ pointers instead of $n$ pointers for every element in the target set (i.e. $26$ for the English alphabet)

> [!info]
> In the case of **strings** or other similar objects, a _Ternary Search [[Trie]]_ will often be **cheaper** than a Hash Map as the comparison is more granlular.