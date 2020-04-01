package com.prachauhan;

import org.junit.Test;

public class TiltOfBinaryTreeTest {
    
    TreeForTest treeForTest = new TreeForTest();
    TiltOfBinaryTree tiltOfBinaryTree=new TiltOfBinaryTree();
    
    @Test
    public void tiltTest(){
        TreeNode head=treeForTest.getTree();
        System.out.println(tiltOfBinaryTree.findTilt(head));
    }
}
