package javaDSA;
import java.util.*;

public class LevelOrder {
    public static void main(String[] args) {
        Node root = new Node(1);                                     //  1
        root.left = new Node(2);                                   //2        3
        root.right = new Node(3);                                //4    5   6   7        
        root.left.left = new Node(4);
        root.right.left = new Node(6);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        List<List<Integer>> li = new ArrayList<>();
        li = levelordertraversal(root);
        for (List<Integer> l1 : li) {
            for (int n : l1) {
                System.out.print(n + " "); 
            }
           
            System.out.println();
         }
    }

    public static List<List<Integer>> levelordertraversal(Node root){
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root==null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int levelsize = q.size();
            List<Integer> l = new LinkedList<>();
            for (int i = 0; i < levelsize; i++) {
                if(q.peek().left !=null) q.offer(q.peek().left); 
                if(q.peek().right !=null) q.offer(q.peek().right);
                l.add(q.poll().data); 
            }
            ans.add(l);
        }
        return ans;
    }
}


class Node{
    int data;
    Node right;
    Node left;

    public Node(int data){
        this.data = data;
        left=right=null;
    }
}