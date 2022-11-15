# Binary Search

### 3 Parts of a Binary Search

Binary Search is generally composed of 3 main sections:

1. **Pre-processing** - Sort if collection is unsorted.
2. **Binary Search** - Using a loop or recursion to divide search space in half after each comparison.
3. **Post-processing** - Determine viable candidates in the remaining space.

<br>

### Template:

1. `Template #1` is used to search for an element or condition which can be determined by *accessing a single index* in the array.

```java
int lo = 0, hi = nums.length - 1;

while (lo <= hi) {
    int mid = lo + (hi - lo) / 2;
    if (nums[mid] == target) return mid;
    else if (nums[mid] > target) hi = mid - 1;
    else lo = mid + 1;
}

return -1;
```

2. `Template #2` used to search for an element or condition which requires *accessing the current index and its immediate right neighbor's index* in the array.

```java
int lo = 0, hi = nums.length - 1;

while (lo < hi) {  // this will not check the last element
	if (nums[mid] == target) return mid;
	else if (nums[mid] > target) hi = mid;
	else lo = mid + 1;
}

// do something...   // check whether the last element is the answer
// return lo         // if the last element is the answer
return -1;
```

3. `Template #3` is used to search for an element or condition which requires *accessing the current index and its immediate left and right neighbor's index* in the array.

```java
int lo = 0, hi = nums.length - 1;

while (lo + 1 < hi) {
    int mid = lo + (hi - lo) / 2;
    if (nums[mid] == target) return mid;
    else if (nums[mid] < target) left = mid;
    else right = mid;
}

// Post-processing:
// End Condition: left + 1 == right
if (nums[left] == target) return left;
if (nums[right] == target) return right;
return -1;
```



### 1. Find Element

| No.  | Problem                                                      | Difficulty |
| ---- | ------------------------------------------------------------ | ---------- |
| 0704 | [Binary Search](https://leetcode.com/problems/binary-search/) | Easy       |
| 0374 | [Guess Number Higher or Lower](https://leetcode.com/problems/guess-number-higher-or-lower/) | Easy       |
| 0278 | [First Bad Version](https://leetcode.com/problems/first-bad-version/) | Easy       |



### 2. Insert Element

| No.  | Problem                                                      | Difficulty |
| ---- | ------------------------------------------------------------ | ---------- |
| 0035 | [Search Insert Position](https://leetcode.com/problems/search-insert-position/) | Easy       |
|      |                                                              |            |
|      |                                                              |            |



### 3. Rotated Sorted Array

| No.  | Problem                                                      | Difficulty |
| ---- | ------------------------------------------------------------ | ---------- |
| 0033 | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | Medium     |
| 0081 | [Search in Rotated Sorted Array II](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/) | Medium     |
|      |                                                              |            |



