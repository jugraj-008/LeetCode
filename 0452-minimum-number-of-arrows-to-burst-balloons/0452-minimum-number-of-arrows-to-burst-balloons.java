class Solution {
    public int findMinArrowShots(int[][] intervals) {
        Arrays.sort(intervals , (a,b) -> Integer.compare(a[1] , b[1]));
        int arrows = 1;
        int n = intervals.length;
        int end = intervals[0][1];
        for(int i=1 ; i<n ; i++){
            // start 
            if(intervals[i][0] > end ){
                arrows++;
                end = intervals[i][1];
            }
        }
        return arrows;
    }
}