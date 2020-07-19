/**
 * Insert in a doubly Linked list (put) : always at the front, the new Node becomes the new Head
 * Remove from a doubly Linked list:
 *
 * @author prachichauhan
 */
public class DoublyLinkedList {
    
    private static Node put(Node head, int length) {
        for (int i = 0; i < length; i++) {
            Node newNode = new Node(i + 10);
            newNode.next = head;
            head.prev = newNode;
            
            head = newNode;
        }
        return head;
    }
    
    private static Node delete(Node head, Node del) {
        System.out.println("\ndeleted a node " + del.data + "\n");
        if (del == null || head == null) {
            return null;
        }
        if (head == del) {
            head = del.next;
        }
        //if del is not the last node
        if (del.next != null) {
            del.next.prev = del.prev;
        }
        
        //if del is not the first node
        if (del.prev != null) {
            del.prev.next = del.next;
        }
        return head;
    }
    
    private static void printDll(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "<=>");
            current = current.next;
        }
    }
    
    public static void main(String[] args) {
        Node head = new Node(9000);
        head.prev = null;
        head.next = null;
        int length = 10;
        head = put(head, length);
        printDll(head);
        Node current = head;
        while (current.data != 16) {
            current = current.next;
        }
        head = delete(head, current);
        printDll(head);
    }
}

class Node {
    Node next;
    Node prev;
    int data;
    
    Node(int data) {
        this.data = data;
    }
}
