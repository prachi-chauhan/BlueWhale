package com.prachauhan.problem.solving.two;

public class BinaryTreeFromLinkedList {
    
    public static int getDataAtMid(int mid, ListNode head) {
        int count = 0;
        ListNode current = head;
        while (count < mid) {
            current = current.next;
        }
        return current.data;
    }
    
    public static int getLengthOfList(ListNode listNode) {
        if (listNode.next == null)
            return 0;
        return getLengthOfList(listNode.next) + 1;
        
    }
    
    public static BinaryTreeNode buildBinaryTree(ListNode listNode, int start, int end) {
        if (start > end)
            return null;
        int mid = (end + start) / 2;
        BinaryTreeNode root = new BinaryTreeNode(getDataAtMid(mid, listNode));
        System.out.println(root.data);
        root.left = buildBinaryTree(listNode, start, mid - 1);
        root.right = buildBinaryTree(listNode, mid + 1, end);
        return root;
    }
    
    private static void inorder(BinaryTreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    
    public static void main(String args[]) {
        ListNode listNode = new ListNode(1);
        ListNode nextNode=listNode.next;
        nextNode = new ListNode(2);
        nextNode.next = new ListNode(3);
        nextNode=nextNode.next;
        nextNode = new ListNode(4);
        nextNode.next = new ListNode(5);
        nextNode=nextNode.next;
        nextNode = new ListNode(6);
        nextNode.next = null;
        int length = getLengthOfList(listNode);
        BinaryTreeNode root = buildBinaryTree(listNode, 0, length - 1);
        inorder(root);
    }
}

class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;
    
    BinaryTreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class ListNode {
    int data;
    ListNode next;
    
    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
