// Last updated: 08/09/2026, 19:50:47
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
16import java.util.*;
17
18class Solution {
19    public List<List<Integer>> verticalTraversal(TreeNode root) {
20        List<int[]> nodes = new ArrayList<>();
21        dfs(root, 0, 0, nodes);
22
23        Collections.sort(nodes, (a, b) -> {
24            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
25            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
26            return Integer.compare(a[2], b[2]);
27        });
28
29        List<List<Integer>> result = new ArrayList<>();
30        int previousColumn = Integer.MIN_VALUE;
31
32        for (int[] node : nodes) {
33            if (node[0] != previousColumn) {
34                result.add(new ArrayList<>());
35                previousColumn = node[0];
36            }
37
38            result.get(result.size() - 1).add(node[2]);
39        }
40
41        return result;
42    }
43
44    private void dfs(TreeNode node, int row, int column, List<int[]> nodes) {
45        if (node == null) return;
46
47        nodes.add(new int[]{column, row, node.val});
48
49        dfs(node.left, row + 1, column - 1, nodes);
50        dfs(node.right, row + 1, column + 1, nodes);
51    }
52}