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

	static void printleafnode(Node root) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
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
			int size = q.size(); // To check how many nodes are there at each level
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

	//inorder traversal of tree
	public static void inOrder(Node root) {
	if(root==null) return;
	inOrder(root.left);
	System.out.print(root.data+" ");
	inOrder(root.right);
	
	}

    //Vertical order traversal of a binary tree 
	static void verticalOrder(Node root) {
		if (root == null) {
			return;
		}
		Map<Integer, List<Integer>> map = new HashMap<>();
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		int hd = 0;
		while (!q.isEmpty()) {
			Node temp = q.poll();
			if (temp == null) {
				if (!q.isEmpty()) {
					q.add(null);
					hd++;
				}
			} else {
				if (map.containsKey(hd)) {
					map.get(hd).add(temp.data);
				} else {
					List<Integer> list = new ArrayList<>();
					list.add(temp.data);
					map.put(hd, list);
				}
				if (temp.left != null) {
					q.add(temp.left);
				}
				if (temp.right != null) {
					q.add(temp.right);
				}
			}
		}
		for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
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
