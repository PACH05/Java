

// Given the root of a binary tree, return the length of the diameter of the tree.
// The diameter of a binary tree is the length of the longest path between any two nodes in a tree. 
// This path may or may not pass through the root.
// The length of a path between two nodes is represented by the number of edges between them.
public class DiameterofBT {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(6);
        root.left.right = new Node(5);
        root.right.right = new Node(7);

        var dm = diameter(root);
        System.out.println("Diameter of the Binary tree is : " + dm);
    }
    
    static int ans = 0;
    private static int diameter(Node root) {
        if (root == null)
            return 0;
        height(root);
        return ans;
    }
    private static int height(Node root) {
              //if root==null height==0
              if(root==null)return -1;
        
              int L=height(root.left);
              int R=height(root.right);
              //ans signfies(no. of nodes farthest apart) or the DIAMETER
              ans=Math.max(ans,L+R+2);
              //height of the tree is max of LST & RST +1
              return 1+Math.max(L,R);
    }

    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
}
