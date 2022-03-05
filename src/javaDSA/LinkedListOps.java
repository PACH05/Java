package javaDSA;

public class LinkedListOps {
    public static void main(String[] args) {
        Node node = new Node(2);
        node.next = new Node(3);
        node.next.next = new Node(4);
        node.next.next.next = new Node(5);
        insertbeg(node, 1);
        insertatend(node, 6);
    }
    public static void insertatend(Node node, int data) {
        Node newNode = new Node(data);
        Node temp = node;
        while (temp.next != null) {
            temp = temp.next; 
        }
        temp.next = newNode;
    }
    
    public static void insertbeg(Node head, int data){
        Node node = new Node(data);
        node.data = data;
        node.next=head;

    }
    public static void deletenode(Node head, int data){
    Node temp = head;
    Node prev = null;
    while(temp.data != data){
        prev = temp;
        temp = temp.next;
    }
    prev.next = temp.next;

  }
    // For Singly Linked Lists 
  static class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
}

