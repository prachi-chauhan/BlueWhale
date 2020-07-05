package com.prachauhan;

public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int length = getLength(current);
        if(length==2)
            return current.next;
        else if(length==1)
            return current;
            int i = 0;
            while (i < length / 2) {
                current=current.next;
                i++;
            }
            return current;
        
    }
    
    private int getLength(ListNode node) {
        if (node==null)
            return 0;
        return getLength(node.next) + 1;
    }
}
