class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];

        if (original == color) {
            return image;
        }

        dfs(image, sr, sc, original, color);
        return image;
    }

    private void dfs(int[][] image, int r, int c, int original, int color) {
        // Boundary or different color -> stop
        if (r < 0 || r >= image.length ||
            c < 0 || c >= image[0].length ||
            image[r][c] != original) {
            return;
        }

        // Recolor current cell
        image[r][c] = color;

        // Explore 4 directions
        dfs(image, r + 1, c, original, color); // Down
        dfs(image, r - 1, c, original, color); // Up
        dfs(image, r, c + 1, original, color); // Right
        dfs(image, r, c - 1, original, color); // Left
    }
}