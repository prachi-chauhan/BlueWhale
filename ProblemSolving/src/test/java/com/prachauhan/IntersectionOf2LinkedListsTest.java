package com.prachauhan;

import org.junit.Test;


public class IntersectionOf2LinkedListsTest {
    IntersectionOf2LinkedLists intersectionOf2LinkedLists = new IntersectionOf2LinkedLists();
    
    @Test
    public void intersectionTest() {
        ListNode headA = new ListNode(4);
        ListNode headB = new ListNode(5);
        ListNode commonListHead = new ListNode(8);
        ListNode currentA = headA;
        ListNode currentB = headB;
        ListNode currentCommonList = commonListHead;
        
        int[] arrA = {1};
        int[] arrB = {0, 1};
        int[] common = {4, 5};
        for (int i : common) {
            currentCommonList.next = new ListNode(i);
            currentCommonList = currentCommonList.next;
        }
        for (int i : arrA) {
            currentA.next = new ListNode(i);
            currentA = currentA.next;
        }
        currentA.next = commonListHead;
        for (int i : arrB) {
            currentB.next = new ListNode(i);
            currentB = currentB.next;
        }
        currentB.next=commonListHead;
        
        int res = intersectionOf2LinkedLists.getIntersectionNode(headA, headB).val;
        System.out.println(res);
    }
}
