import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        depth = maxDepth(root, depth);
        return depth;
    }

    private int maxDepth(TreeNode root, int depth) {

        if (root == null)
            return depth;
        int depth1 = maxDepth(root.left, depth + 1);
        int depth2 = maxDepth(root.right, depth + 1);
        return depth1 > depth2 ? depth1 : depth2;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}