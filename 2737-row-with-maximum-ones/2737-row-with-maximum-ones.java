class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOnes = 0;
        int rowIndex = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxOnes) {
                maxOnes = count;
                rowIndex = i;
            }
        }

        return new int[]{rowIndex, maxOnes};
    }
}