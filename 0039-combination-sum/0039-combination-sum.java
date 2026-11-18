class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates , target ,0 , target , result , new ArrayList<>());
        return result;
    }
    public static void helper(int[] candidates , int target , int start , int remaining , List<List<Integer>> result , List<Integer> path){
        if(remaining == 0){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=start ; i<candidates.length ; i++){
            if(candidates[i] > remaining){
                continue;
            }
            path.add(candidates[i]);
            helper(candidates , target , i , remaining-candidates[i] , result , path);
            path.remove(path.size() - 1);
        }
    }
}