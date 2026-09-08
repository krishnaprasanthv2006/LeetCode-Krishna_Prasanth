// Last updated: 08/09/2026, 10:03:18
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
17    int cameras = 0;
18
19    public int minCameraCover(TreeNode root) {
20        return dfs(root) == 0 ? cameras + 1 : cameras;
21    }
22
23    private int dfs(TreeNode node) {
24        if (node == null) {
25            return 1;
26        }
27
28        int left = dfs(node.left);
29        int right = dfs(node.right);
30
31        if (left == 0 || right == 0) {
32            cameras++;
33            return 2;
34        }
35
36        if (left == 2 || right == 2) {
37            return 1;
38        }
39
40        return 0;
41    }
42}