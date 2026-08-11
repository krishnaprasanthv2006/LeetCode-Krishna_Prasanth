// Last updated: 11/08/2026, 14:12:53
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
class Solution {
    int count=0;
    public int countDominantNodes(TreeNode root) {
            findMax(root);
        return count;
        }
    private int findMax(TreeNode root){
        if(root == null )
            return Integer.MIN_VALUE;
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);
        int subtreeMax=Math.max(root.val,Math.max(leftMax,rightMax));

        if(root.val == subtreeMax)
            count++;
        return subtreeMax;
    }
}