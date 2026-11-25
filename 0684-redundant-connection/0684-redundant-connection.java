import java.util.*;

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            boolean[] visited = new boolean[n + 1];

            if (dfs(u, v, graph, visited)) {
                return edges[i];
            }

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        return new int[0];
    }

    boolean dfs(int node, int target, ArrayList<ArrayList<Integer>> graph,
                boolean[] visited) {

        if (node == target) {
            return true;
        }

        visited[node] = true;

        for (int i = 0; i < graph.get(node).size(); i++) {
            int neighbor = graph.get(node).get(i);

            if (!visited[neighbor]) {
                if (dfs(neighbor, target, graph, visited)) {
                    return true;
                }
            }
        }

        return false;
    }
}