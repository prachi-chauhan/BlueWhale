package com.prachauhan;

/**
 * return true if all nodes in the tree have the same value
 */
public class UnivaluedTree {
    public boolean isUnivalTree(TreeNode root) {
        return traverse(root);
    }
    
    private boolean traverse(TreeNode node) {
        //returning a neg number in case of leaf nodes and absolute values in case of other nodes provided, the left and right
//        child of the node have the same value;
        boolean leftChild = (node.left == null || (node.val == node.left.val && traverse(node.left)));
        boolean rightChild = (node.right == null || (node.val == node.right.val) && traverse(node.right));
        return leftChild && rightChild;
    }
}
