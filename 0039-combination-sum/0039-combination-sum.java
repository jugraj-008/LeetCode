class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
            if(candidates[i] > remaining) continue;
            path.add(candidates[i]);
            helper(candidates , remaining-candidates[i] , i,path , result);
            path.remove(path.size()-1);
        }
    }
}