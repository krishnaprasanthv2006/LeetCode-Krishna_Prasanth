// Last updated: 11/09/2026, 09:27:18
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<int[]> nodes = new ArrayList<>();
        dfs(root, 0, 0, nodes);

        Collections.sort(nodes, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[2], b[2]);
        });

        List<List<Integer>> result = new ArrayList<>();
        int previousColumn = Integer.MIN_VALUE;

        for (int[] node : nodes) {
            if (node[0] != previousColumn) {
                result.add(new ArrayList<>());
                previousColumn = node[0];
            }

            result.get(result.size() - 1).add(node[2]);
        }

        return result;
    }

    private void dfs(TreeNode node, int row, int column, List<int[]> nodes) {
        if (node == null) return;

        nodes.add(new int[]{column, row, node.val});

        dfs(node.left, row + 1, column - 1, nodes);
        dfs(node.right, row + 1, column + 1, nodes);
    }
}