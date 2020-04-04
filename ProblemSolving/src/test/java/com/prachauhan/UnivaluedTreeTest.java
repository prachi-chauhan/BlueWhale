package com.prachauhan;

import org.junit.Test;

public class UnivaluedTreeTest {
    TreeForTest treeForTest = new TreeForTest();
    
    
    @Test
    public void univaluedTest(){
        UnivaluedTree univaluedTree=new UnivaluedTree();
        System.out.println(univaluedTree.isUnivalTree(treeForTest.getTree()));
    }
    
}
