/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getMinimumDifference(TreeNode root) {
         if (root == null) {
            return Integer.MAX_VALUE;
        }
        int result = Integer.MAX_VALUE;
        if (root.left != null) {
            int val = Math.abs(root.val - findRightmostNodeVal(root.left));
            result = Math.min(result, val);
        }
        if (root.right != null) {
            int val = Math.abs(root.val - findLeftmostNodeVal(root.right));
            result = Math.min(result, val);
        }
        return Math.min(result, Math.min(
                getMinimumDifference(root.left),
                getMinimumDifference(root.right)));
    }
    
     private int findLeftmostNodeVal(TreeNode node) {
        if (node.left == null) {
            return node.val;
        }
        return findLeftmostNodeVal(node.left);
    }

    private int findRightmostNodeVal(TreeNode node) {
        if (node.right == null) {
            return node.val;
        }
        return findRightmostNodeVal(node.right);
    }
}