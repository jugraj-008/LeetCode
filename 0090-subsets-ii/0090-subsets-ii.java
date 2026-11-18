class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        helper(result , new ArrayList<>() , nums , 0);
        return result;
    }
    public static void helper(List<List<Integer>> result , List<Integer> path , int[] nums , int start){

        result.add(new ArrayList<>(path));
        for(int i= start ; i<nums.length ; i++){
            if(i > start && nums[i-1] == nums[i]){
                continue;
            }
            path.add(nums[i]);
            helper(result , path , nums , i+1);
            path.remove(path.size() - 1);
        }
    }
}