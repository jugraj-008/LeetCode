class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer , Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1);
        }
        for(int frequency : map.values()){
            if(set.contains(frequency)){
                return false;
            }
            set.add(frequency);
        }
        return true;
        
    }
}