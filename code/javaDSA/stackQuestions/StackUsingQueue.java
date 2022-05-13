package javaDSA.stackQuestions;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StackUsingQueue {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.pushnum(1);
        sol.pushnum(2);
        sol.pushnum(3);
        sol.pushnum(4);
        System.out.println(sol.pop());
    }
}

class Solution{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void pushnum(int num){
        if(q1.isEmpty()){
            q1.add(num);
        }
        else if(q2.isEmpty()){
            q2.add(num);
        }
        else{
            q1.add(q2.poll());
            q2.add(num);
        }
    }

    public int pop(){
        int num = 0;
        if(q2.isEmpty()){
            if(!q1.isEmpty()){
                num = q1.poll();
            }
            else{
                return 0;
            }
        }
        else{
            num = q2.poll();
            Collections.reverse((List<Integer>) q1);
            q2.add(q1.poll());
        }
        return num;
    }

    public int top(){
        int num = q2.poll();

        return num;
    }
    public int size(){
        if(!q2.isEmpty()){
            return q1.size()+1;
        }
        else return q1.size();
        
    }
}
