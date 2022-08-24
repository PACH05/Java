package javaDSA.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CycleDetection {
    public static void main(String[] args) {
     List<List<Integer>> graph = new ArrayList<>();
     int V = 5;
     boolean flag = dfscycle(graph,V);   
     System.out.println(flag);
    }

    private static boolean dfscycle(List<List<Integer>> graph, int V) {
        boolean vis[] = new boolean[V+1];
        Arrays.fill(vis,false);       
        for (int i = 0; i <=V; i++) {
            if(vis[i]==false){
                if(checkCycle(i,-1,vis,graph)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkCycle(int node, int parent, boolean[] vis, List<List<Integer>> graph) {
        vis[node] = true;
        for (Integer it : graph.get(node)) {
            if(vis[it]==false){
                checkCycle(it, node, vis, graph);
            }
        }       
        return false;
    }
}
