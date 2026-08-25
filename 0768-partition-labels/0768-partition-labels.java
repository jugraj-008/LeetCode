class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        int n = s.length();
        for(int i=0 ; i<n ; i++){
            last[s.charAt(i) - 'a'] = i;
        }
        List<Integer> ans = new ArrayList<>();
        int start = 0;
        int end = 0;
        for(int i=0 ; i<n ; i++){
            end = Math.max(end , last[s.charAt(i)-'a']);
            if(i == end){
                ans.add(i-start+1);
                start = i+1;
            }
        }
        return ans;

    }
}