package com.prachauhan;

public class TiltOfBinaryTree {
    int tilt = 0;
    
    public int findTilt(TreeNode node) {
        traverse(node);
        return tilt;
    }
    
    private int traverse(TreeNode node) {
        if (node == null)
            return 0;
        int sumL = traverse(node.left);
        int sumR = traverse(node.right);
        tilt += Math.abs(sumL - sumR);
        return sumL + sumR + node.val;
    }
    
}
