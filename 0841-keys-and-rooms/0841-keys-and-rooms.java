import java.util.*;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();

        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        visited[0] = true;

        int count = 1;

        while (!stack.isEmpty()) {
            int room = stack.pop();

            for (int i = 0; i < rooms.get(room).size(); i++) {
                int next = rooms.get(room).get(i);

                if (!visited[next]) {
                    visited[next] = true;
                    count++;
                    stack.push(next);
                }
            }
        }

        return count == n;
    }
}