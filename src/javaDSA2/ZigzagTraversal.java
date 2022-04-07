package javaDSA2;

import java.util.*;

//Zigzag Order Traversal of a Binary Tree
public class ZigzagTraversal {
    public static void main(String[] args) {
        Node root = new Node(1); // 1
        root.left = new Node(2); // 2 3
        root.right = new Node(3); // 4 5 6 7
        root.left.left = new Node(4);
        root.right.left = new Node(6);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        List<List<Integer>> li = new ArrayList<>();
        li = zigzagordertraversal(root);
        for (List<Integer> l1 : li) {
            for (int n : l1) {
                System.out.print(n + " ");
            }

            System.out.println();
        }
    }
    public static List<List<Integer>> zigzagordertraversal(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        boolean flag = false;
        if (root == null)
            return ans;
        q.offer(root);
        while (!q.isEmpty()) {
            int levelsize = q.size();
            List<Integer> l = new LinkedList<>();
            for (int i = 0; i < levelsize; i++) {
                Node node = q.poll();
                if (flag) {
                    l.add(0, node.data);
                }
                else {
                    l.add(node.data);
                }
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
          }
            flag = !flag;
            ans.add(l); 
        }
        return ans;
    }
    static class Node {
        int data;
        Node right;
        Node left;
    
        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
}




