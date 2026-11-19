class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(nums , result , new ArrayList<>());
        return result;
    }
    public static void helper(int[] nums , List<List<Integer>> result , List<Integer> path){
        if(path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=0 ; i<nums.length ; i++){
            if(path.contains(nums[i])) continue;
            path.add(nums[i]);
            helper(nums , result , path);
            path.remove(path.size()-1);
        }
    }
}