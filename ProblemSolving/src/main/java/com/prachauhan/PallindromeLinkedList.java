package com.prachauhan;

import java.util.ArrayList;

public class PallindromeLinkedList {
    //    simply create a duplicated reverse list
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayListRev = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            arrayList.add(current.val);
            current = current.next;
        }
        ListNode temp = head;
        ListNode rev = reverse(temp);
        while (rev != null) {
            arrayListRev.add(rev.val);
            rev = rev.next;
        }
        if (arrayList.equals(arrayListRev))
            return true;
        else return false;
    }
    
    private ListNode reverse(ListNode temp) {
        ListNode prev = null, next;
        ListNode curr = temp;
        
        while (curr != null) {
            next = curr.next;
//            switching direction
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
