class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); //// Sort children by greed factor
        Arrays.sort(s); //// Sort cookies by size
        int i=0; //child
        int j=0; //cookie

        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i;
    }
}