class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == '1') {
                    dfs(grid, row, col);
                    islands++;
                }
            }
        }

        return islands;
    }

    private void dfs(char[][] grid, int row, int col) {
        int m = grid.length;
        int n = grid[0].length;
        
        if (row < 0 || row >= m ||
            col < 0 || col >= n ||
            grid[row][col] != '1') {
            return;
        }

        grid[row][col] = '0'; // Mark visited

        dfs(grid, row - 1, col); // Up
        dfs(grid, row + 1, col); // Down
        dfs(grid, row, col - 1); // Left
        dfs(grid, row, col + 1); // Right
    }
}