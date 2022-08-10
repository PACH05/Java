package javaDSA.trees;
import javaDSA.trees.HeightOfBT.Node;

//Flatten a Binary Tree to make it a linked list. 
//The linked list should be the preorder traversal of the binary tree
public class BinaryTreeToLinkedList {
    public static void main(String[] args) {
        Node root = new Node(1); // 1
        root.left = new Node(2); // 2 3
        root.right = new Node(3); // 4 5 6 7
        root.left.left = new Node(4);
        root.right.left = new Node(6);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        flatten(root);
    }
    static Node prev = null;

    private static void flatten(Node root) {
        if(root == null) return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
}
