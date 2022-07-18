package javaDSA.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule {
    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequesites = {{0,1}};
        boolean flag = isPossible(numCourses, prerequesites);
        System.out.println(flag);
    }

    // BFS using Kahn's Algorithm

    private static boolean isPossible(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0 ; i<numCourses ; i++){
            adj.add(new ArrayList<>());
        }
        for(int pair[] : prerequisites){
            adj.get(pair[0]).add(pair[1]);
        }
        int indegree[] = new int[numCourses];
        for(int i=0 ; i<numCourses ; i++){
            for(int it : adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0 ; i<numCourses ; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        int count = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            count++;
            for(int it : adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.add(it);
                }
            }
        }
        return count == numCourses;
       
    }
}
