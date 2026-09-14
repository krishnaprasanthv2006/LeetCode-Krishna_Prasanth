// Last updated: 14/09/2026, 12:17:28
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int ans = Integer.MIN_VALUE;
18
19    public int maxPathSum(TreeNode root) {
20        dfs(root);
21        return ans;
22    }
23
24    int dfs(TreeNode node) {
25        if (node == null) {
26            return 0;
27        }
28
29        int left = Math.max(0, dfs(node.left));
30        int right = Math.max(0, dfs(node.right));
31
32        ans = Math.max(ans, node.val + left + right);
33
34        return node.val + Math.max(left, right);
35    }
36}