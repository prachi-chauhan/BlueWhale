package com.prachauhan;

import org.junit.Test;

public class ReorderLinkedListTest {
    
    @Test
    public void reorderLinkedListTest(){
        LinkedListForTest linkedListForTest=new LinkedListForTest();
        ListNode head= linkedListForTest.getCurrent();
        ReorderLinkedList reorderLinkedList=new ReorderLinkedList();
        reorderLinkedList.reorderList(head);
    }
}
