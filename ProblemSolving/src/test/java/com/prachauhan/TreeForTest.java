package com.prachauhan;

public class TreeForTest {
    TreeNode treeNode=new TreeNode(1);
    
    private TreeNode createTree(){
        treeNode.left=new TreeNode(1);
        treeNode.right=new TreeNode(1);
        treeNode.left.left=new TreeNode(1);
        treeNode.left.right=new TreeNode(1);
        treeNode.right.right=new TreeNode(2);
        return treeNode;
    }
    
    public TreeNode getTree() {
        return createTree();
    }
}
