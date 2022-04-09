package javaDSA.linkedlistProblems;

public class ReverseLL {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        printLL(node);
        node = reversell(node);
        System.out.println("\n");
        printLL(node);
    }
    
    public static Node reversell(Node head){
        Node curr = head;
        Node prev=null;
        Node next=null;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;

    }
    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }
    // For Singly Linked Lists
    static class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
                this.next = null;
            }
}
}