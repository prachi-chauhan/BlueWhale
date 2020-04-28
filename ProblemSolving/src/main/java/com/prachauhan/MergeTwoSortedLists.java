package com.prachauhan;

import com.sun.codemodel.internal.util.UnicodeEscapeWriter;

import java.util.List;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode res = head;
        while (l1 != null) {
            if (l2 == null) {
                res.next = new ListNode(l1.val);
                res = res.next;
                l1 = l1.next;
            } else if (l2.val <= l1.val) {
                res.next = new ListNode(l2.val);
                res = res.next;
                l2 = l2.next;
            } else {
                res.next = new ListNode(l1.val);
                res = res.next;
                l1 = l1.next;
            }
        }
        while (l2 != null) {
            res.next = new ListNode(l2.val);
            l2 = l2.next;
            res = res.next;
        }
        return head.next;
        
    }
    
}
