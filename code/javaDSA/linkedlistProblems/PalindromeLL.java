package javaDSA.linkedlistProblems;
import java.util.*;


public class PalindromeLL{    
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(2);
        node.next.next.next = new Node(1);
        printll(node);
        System.out.println(isPalindrome(node));    
    }

    private static boolean isPalindrome(Node head){
        Stack<Node> stk = new Stack<>();
        Node ptr = head;
        while(ptr!=null){
            stk.push(ptr);
            ptr = ptr.next;
        } 
        while (head!=null && !stk.isEmpty()) {
            if(head.data != stk.pop().data) return false;
            else head = head.next;
        }
         return true;
    }

    public static void printll(Node head){
       while (head != null) {
           System.out.println(head.data);
           head = head.next;
       }
    } 
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
