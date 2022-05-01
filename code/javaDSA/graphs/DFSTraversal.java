package javaDSA.graphs;

import java.util.ArrayList;
import java.util.List;

public class DFSTraversal {
    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> graph = new ArrayList<>();
        dfsutil(graph, V);
    }

    private static void dfsutil(List<List<Integer>> graph, int v) {
        boolean vis[] = new boolean[v+1];
        List<Integer> store_dfs = new ArrayList<>();
        for (int i = 0; i <=v; i++) {
            if(!vis[i]){
                dfs(i,vis, graph, store_dfs);
            }
        }
    }

    private static List<Integer> dfs(int node, boolean vis[], List<List<Integer>> graph,  List<Integer> store_dfs) {
        store_dfs.add(node);
        vis[node] = true;
        for (Integer i : graph.get(node)) {
            if(vis[i]==false){
                dfs(i, vis, graph, store_dfs);
            }
        } 
        return store_dfs;
    }
}
