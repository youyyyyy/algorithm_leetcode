# Tree

### Depth First Search (`DFS`)

```java
void dfs(TreeNode root) {
    if (root == null) return;
    dfs(root.left);
    dfs(root.right);
}
```

```
     1
    / \
   2   3
  / \
 4   5
```

- Pre-order

```java
// node -> left -> right  [1, 2, 4, 5, 3]
void dfs(TreeNode root) {
    if (root == null) return;
    System.out.println(root.val);
    dfs(root.left);
    dfs(root.right);
}
```

- In-order

```java
// left -> node -> right  [4, 2, 5, 1, 3]
void dfs(TreeNode root) {
    if (root == null) return;
    dfs(root.left);
    System.out.println(root.val);
    dfs(root.right);
}
```

- Post-order

```java
// left -> right -> node  [4, 5, 2, 3, 1]
void dfs(TreeNode root) {
    if (root == null) return;
    dfs(root.left);
    dfs(root.right);
    System.out.println(root.val);
}
```

### Breadth First Search (`BFS`)

```java
void bfs(TreeNode root) { // [1, 2, 3, 4, 5]
	Queue<TreeNode> queue = new LinkedList<>();
	queue.add(root);
	while (!queue.isEmpty()) {
		TreeNode temp = queue.poll();
        System.out.println(temp.val);
		if (temp.left != null) queue.add(temp.left);
		if (temp.right != null) queue.add(temp.right);
	}
}
```

<br>

### 1. Traverse a Tree

#### 1.1 `DFS`

| No.  | Problem                                                      | Difficulty |
| ---- | ------------------------------------------------------------ | ---------- |
| 0144 | [Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/) | Easy       |
| 0094 | [Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/) | Easy       |
| 0145 | [Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/) | Easy       |

#### 1.2 `BFS` - level traverse

| No.  | Problem                                                      | Difficulty |
| ---- | ------------------------------------------------------------ | ---------- |
| 0102 | [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) | Medium     |
| 0107 | [Binary Tree Level Order Traversal II](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/solution/) | Medium     |
| 0429 | [N-ary Tree Level Order Traversal](https://leetcode.com/problems/n-ary-tree-level-order-traversal/) | Medium     |
| 0637 | [Average of Levels in Binary Tree](https://leetcode.com/problems/average-of-levels-in-binary-tree/) | Easy       |
| 0515 | [Find Largest Value in Each Tree Row](https://leetcode.com/problems/find-largest-value-in-each-tree-row/) | Medium     |
| 0103 | [Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/) | Medium     |
| 0199 | [Binary Tree Right Side View ](https://leetcode.com/problems/binary-tree-right-side-view/) | Medium     |
| 1161 | [Maximum Level Sum of a Binary Tree](https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/) | Medium     |
| 0662 | [Maximum Width of Binary Tree](https://leetcode.com/problems/maximum-width-of-binary-tree/) | Medium     |

We can also use level traverse to check completeness of a binary tree:

> In a **complete binary tree**, every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible.

| No.  | Problem                                                      | Difficulty |
| ---- | ------------------------------------------------------------ | ---------- |
| 0958 | [Check Completeness of a Binary Tree](https://leetcode.com/problems/check-completeness-of-a-binary-tree/) | Medium     |



<br>

### 2. Binary Search Tree

Binary Search Tree is a binary tree where the key in each node:

- is greater than any key stored in the left sub-tree
- is less than any key stored in the right sub-tree

#### 3.1 Search

| No.  | Problem                                                      | Difficulty |
| ---- | ------------------------------------------------------------ | ---------- |
| 0700 | [Search in a Binary Search Tree](https://leetcode.com/problems/search-in-a-binary-search-tree/) | Easy       |
|      |                                                              |            |
|      |                                                              |            |



#### 3.2 Insert

#### 3.3 Delete

