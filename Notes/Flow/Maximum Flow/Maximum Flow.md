---
tags:
  - Example
  - Flow
aliases:
  - Max Flow
---
A _maximum [[Flow Network|flow]]_ problem involves finding a feasible [[Flow Network|flow]] through a [[Flow Network|flow network]] that obtains the maximum possible flow rate.

---
### Example
![[Max Flow Image.png]]

> What is the _maximum possible [[Flow Network|flow]]_ through this graph from $s$ to $t$.

The maximum [[Flow Network|flow]] going out of the **source node**, $s$ is $10 + 5 = 15$.

Hence, we are free to send the full $10$ into $u$ and the full $5$ into $v$.

However, $u$ can only output $5$ into the **sink node**, hence we must send $5$ down to $v$ before outputting $10$ from $v$ and $5$ from $u$ into the **sink node**.