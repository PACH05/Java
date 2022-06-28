package javaDSA.linkedlistProblems;

public class CycleInLL {
    public static void main(String[] args) {
        Node head = new Node(3);
		head.next = new Node(2);
		head.next.next = new Node(0);
		head.next.next.next = new Node(-4);
		head.next.next.next.next = head.next.next;
		System.out.println(detectCycle(head));
	}

	static boolean detectCycle(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return true;
			}
		}
		return false;
	}
}
class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		next = null;
	}
}


