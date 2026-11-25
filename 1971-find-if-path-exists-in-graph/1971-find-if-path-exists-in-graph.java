import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();

        stack.push(source);
        visited[source] = true;

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (node == destination) {
                return true;
            }

            for (int i = 0; i < graph.get(node).size(); i++) {
                int neighbor = graph.get(node).get(i);

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }

        return false;
    }
}