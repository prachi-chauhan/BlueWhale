package com.prachauhan;

public class BinaryTreeFromArray {
    
    private Node buildBst(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end )/ 2;
        Node root = new Node(arr[mid]);
        root.left = buildBst(arr, start, mid - 1);
        root.right = buildBst(arr, mid + 1, end);
        
        return root;
    }
    private void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        BinaryTreeFromArray binaryTreeFromArray = new BinaryTreeFromArray();
        int start = 0;
        int end = arr.length-1;
        Node root = binaryTreeFromArray.buildBst(arr, start, end);
        binaryTreeFromArray.inorder(root);
    }
    
}

class Node {
    int data;
    Node left, right;
    
    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
