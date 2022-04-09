package javaDSA.graphs;

import java.util.*;

public class BFSTraversal {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int V = 5;
        BFS(V, graph);
    }
// BFS traversal of a graph
    public static ArrayList<Integer> BFS(int V, ArrayList<ArrayList<Integer>> graph) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                visited[i] = true;
                while (!q.isEmpty()) {
                    int node = q.poll();
                    result.add(node);
                    for (Integer integer : graph.get(node)) {
                        if (!visited[integer]) {
                            q.add(integer);
                            visited[integer] = true;
                        }
                    }
                }
            }
        }

        return result;
    }
}
