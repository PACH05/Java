package javaDSA2;

import java.util.*;

public class Graph1 {

    public static void main(String[] args) {
        System.out.println("Hello");
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
                    for (Integer inte : graph.get(node)) {
                        if (!visited[inte]) {
                            q.add(inte);
                            visited[inte] = true;
                        }
                    }
                }
            }
        }

        return result;
    }
}
