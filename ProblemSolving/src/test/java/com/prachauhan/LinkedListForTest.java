package com.prachauhan;

public class LinkedListForTest {
    
    ListNode head = new ListNode(2);
    
    public ListNode getCurrent() {
        ListNode newHead = createList(head);
        return newHead;
    }
    
    private ListNode createList(ListNode head) {
        ListNode current = head;
        int[] arr ={3, 4, 3, 2};
        for (int i : arr) {
            current.next=new ListNode(i);
            current=current.next;
        }
        return head;
    }
}
