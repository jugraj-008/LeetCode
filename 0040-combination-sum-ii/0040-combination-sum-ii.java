class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates , target , 0 , new ArrayList<>() , result);
        return result;
    }
    public static void helper(int[] candidates , int remaining , int start , List<Integer> path , List<List<Integer>> result){
        if(remaining == 0){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=start ; i<candidates.length ; i++){
            if(i > start && candidates[i-1] == candidates[i] || candidates[i] > remaining ) continue;
            path.add(candidates[i]);
            helper(candidates , remaining-candidates[i] , i+1,path , result);
            path.remove(path.size()-1);
        }
    }
}