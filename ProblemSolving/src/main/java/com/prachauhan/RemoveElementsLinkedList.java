package com.prachauhan;

public class RemoveElementsLinkedList {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = head, current = head;
        if(head==null)
            return head;
        while (current != null && current.val == val) {
            head = current.next;
            current = head;
        }
        
        while (current != null){
            while( current!=null && current.val!=val){
                prev=current;
                current=current.next;
            }
            
            //val not found
            if(current==null){
                return head;
            }
            
            prev.next=current.next;
            current=prev.next;
        }
        return head;
    }
}
