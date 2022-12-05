# Dynamic Programming

### Two ways to implement DP algorithm:

1. Bottom-up (Tabulation)

```java
int[] dp = new int[n + 1];
dp[0] = 0;
dp[1] = 1;
for(int i = 2; i <= n; i++) {
	dp[i] = dp[i-1] + dp[i-2];
}
```

2. Top-down (Memoization)

```java
HashMap<Integer, Integer> map = new HashMap<>();
map.put(0, 0);
map.put(1, 1);

public int fib(int n) {
    if (cache.containsKey(n)) return map.get(n);
    map.put(n, fib(n - 1) + fib(n - 2));
    return map.get(n);
}
```

<br>

### 1. Basic

| No.  | Problem                                                      | Difficulty |
| ---- | ------------------------------------------------------------ | ---------- |
| 0509 | [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/) | Easy       |
| 0070 | [Climbing Stairs - LeetCode](https://leetcode.com/problems/climbing-stairs/) | Easy       |
| 0198 | [House Robber](https://leetcode.com/problems/house-robber/)  | Medium     |

