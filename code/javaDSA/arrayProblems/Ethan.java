package javaDSA.arrayProblems;

import java.util.PriorityQueue;

public class Ethan {
    public static void main(String[] args) {
		int arr[] = new int[] { 9, 8, 2, 5 };
		System.out.println(solve(arr, 3));
	}

	private static int solve(int arr[], int work) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
		for (int e : arr) {
			pq.add(e);
		}
		int count = 0;
		while (true) {
			if (pq.peek() == 0) {
				return count;
			}
			count++;
			int temp[] = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				temp[i] = pq.poll();
			}
			for (int i = 0; i < arr.length; i++) {
				if (i == 0) {
					temp[i] -= work;
				} else {
					temp[i]--;
				}
			}
			for (int e : temp) {
				pq.add(e);
			}
		}
	}
}
