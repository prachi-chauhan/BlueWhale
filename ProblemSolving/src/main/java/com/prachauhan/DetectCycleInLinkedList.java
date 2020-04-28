package com.prachauhan;

import java.awt.image.Kernel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DetectCycleInLinkedList {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode current=head;
        while(current!=null){
            if(set.contains(current)){
                return true;
            }
            set.add(current);
            current=current.next;
        }
        return false;
    }
}
