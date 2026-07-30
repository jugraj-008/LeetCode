class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int st = 0;
        int end = rows * cols - 1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            int midEle = matrix[mid / cols][mid % cols];
            if(midEle == target){
                return true;
            }
            else if(midEle < target){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
}