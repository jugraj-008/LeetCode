import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            Arrays.fill(board[i], '.');

        recursion(0, board, ans);
        return ans;
    }

    private void recursion(int row, char[][] board, List<List<String>> ans) {
        if (row == board.length) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < board.length; i++)
                temp.add(new String(board[i]));
            ans.add(temp);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                recursion(row + 1, board, ans);
                board[row][col] = '.';
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length;
             i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
        // Place one queen row-by-row only in a safe column, recurse to the next row, then backtrack (remove the queen) if needed.
    }
}