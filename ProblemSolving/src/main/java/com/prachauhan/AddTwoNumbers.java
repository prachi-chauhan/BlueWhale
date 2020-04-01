package com.prachauhan;

public class AddTwoNumbers {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = l1, q = l2, curr = head;
        int nodeCarry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            
            int nodeSum = (x + y + nodeCarry) % 10;
            nodeCarry = (x + y + nodeCarry) / 10;
            
            curr.next = new ListNode(nodeSum);
            curr = curr.next;
            
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (nodeCarry > 0) {
            curr.next = new ListNode(nodeCarry);
        }
        return head.next;
    }
}
