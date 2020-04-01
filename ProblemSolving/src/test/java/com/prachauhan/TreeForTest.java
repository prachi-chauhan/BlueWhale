package com.prachauhan;

public class TreeForTest {
    TreeNode treeNode=new TreeNode(1);
    
    private TreeNode createTree(){
        treeNode.left=new TreeNode(2);
        treeNode.right=new TreeNode(3);
        return treeNode;
    }
    
    public TreeNode getTree() {
        return createTree();
    }
}
