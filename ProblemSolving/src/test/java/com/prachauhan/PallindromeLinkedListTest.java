package com.prachauhan;

import org.junit.Assert;
import org.junit.Test;

public class PallindromeLinkedListTest {
    
    PallindromeLinkedList pallindromeLinkedList = new PallindromeLinkedList();
    LinkedListForTest list = new LinkedListForTest();
    
    @Test
    public void pallindromeList() {
        ListNode head = list.getCurrent();
        boolean output = pallindromeLinkedList.isPalindrome(head);
        Assert.assertTrue(output);
    }
}
