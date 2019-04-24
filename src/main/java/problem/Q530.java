package problem;

/**
 * My解题思路：
 * 一个点与其他点的最小绝对值差
 * = min(该点的左子树的最远右节点，该点的右子树的最远左节点)
 * 最坏时间是O(n^2)
 *
 * @author linda
 * @create 2019-04-24-18:01
 **/
class Q530 {

    int getMinimumDifference(TreeNode root) {
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

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
