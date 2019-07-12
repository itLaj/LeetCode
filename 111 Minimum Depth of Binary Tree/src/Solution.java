import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public int run(TreeNode root) {
        if (root == null)
            return 0;
        //BSF，存放二叉树的节点的栈
        LinkedList<TreeNode> treeList = new LinkedList<>();
        treeList.add(root);
        //记录当前行的最后一个元素
        TreeNode last = root;
        //记录下一行的最后一个元素
        TreeNode nLast = null;
        int depth = 1;
        while (!treeList.isEmpty()){
            TreeNode node = treeList.remove();
            if (node.left == null || node.right == null) {
                return depth;
            }
            if (node.left != null) {
                treeList.add(node.left);
                nLast = node.left;
            }
            if (node.right != null) {
                treeList.add(node.right);
                nLast = node.right;
            }
            if (node == last && !treeList.isEmpty()) {
                depth++;
                last = nLast;
            }
        }
        return depth;
    }

}
