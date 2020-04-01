package com.prachauhan;

class IntersectionOf2LinkedLists {
    ListNode intersection = null;
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB;
        
        while (currA != null) {
            currB = headB;
            while (currB != null) {
                if (currB == currA) {
                    intersection = currB;
                    break;
                }
                currB = currB.next;
            }
            if (intersection != null) {
                break;
            } else
                currA = currA.next;
        }
        return intersection;
    }
    
}