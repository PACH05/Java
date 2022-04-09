import java.util.ArrayList;
import java.util.List;

public class LeftViewOfBinaryTree {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(3);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.right.left = new Node(6);
        root.left.right = new Node(5);
        root.right.right = new Node(7);

        List<Integer> list = new ArrayList<>();
        list = leftviewBT(root,list,0);
        for (Integer i:list) {
            System.out.println(i);
        }
    }

    private static List<Integer>leftviewBT(Node root, List<Integer> l, int level){
        if(root==null) return l;

        if(l.size()==level){
            l.add(root.data);
        }

        leftviewBT(root.left, l, level+1);
        leftviewBT(root.right, l, level+1);

          return l;
    }
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=right=null;
        }

    }
}
