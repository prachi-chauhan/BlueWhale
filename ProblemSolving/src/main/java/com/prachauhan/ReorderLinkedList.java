package com.prachauhan;

public class ReorderLinkedList {
    public void reorderList(ListNode head) {
        if (head == null)
            return;
        ListNode current = head;
    
        // find middle of the list and reverse the right half
        ListNode fast = current, slow = current;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = slow.next;
        }
        // by this time slow is in the middle
        ListNode head2 = reverse(slow);
    
        current.next = null;
    
        // Intertwine the two halves
        merge(head, head2);
    }
    
    private ListNode reverse(ListNode n) {
        ListNode prev = null, cur = n;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
        return prev;
    }
    
    private void merge(ListNode head1, ListNode head2) {
        while (head2 != null) {
            ListNode next = head1.next;
            head1.next = head2;
            head1 = head2;
            head2 = next;
        }
    }
}