package javaDSA2;

import java.util.Scanner;
import java.util.Stack;
class SortStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			Solution g=new Solution();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
        sc.close();
	}
}// } Driver Code Ends

class Solution{

    //Sorting the stack in decreasing order
	public Stack<Integer> sort(Stack<Integer> st)
	{
		if(st.size()<=1) return st;
		int curr = st.pop();
		st = sort(st);
		Stack<Integer> temp = new Stack<>();
		while(!st.isEmpty() && st.peek()>curr) temp.push(st.pop());
		st.push(curr);
		while(!temp.isEmpty()) st.push(temp.pop());
		return st;
	}
}