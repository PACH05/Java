package javaDSA;

import java.util.*;

public class Tree {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		// levelOrder(root);
		printleafnode(root);
	}
	  static void printleafnode(Node root){
		if (root==null) {
			return;
		}
		if(root.left== null && root.right==null){
			System.out.println(root.data);
		}
		printleafnode(root.left);
		printleafnode(root.right);
	
	}
	static void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}

	static void levelOrder(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			int size = q.size(); //To check how many nodes are there at each level
			for (int i = 0; i < size; i++) {
				Node temp = q.poll();
				if (temp.left != null) {
					q.add(temp.left);
				}
				if (temp.right != null) {
					q.add(temp.right);
				}
				System.out.print(temp.data + " ");
			}
			System.out.println();
		}
	}
}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}
