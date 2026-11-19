class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        helper(nums , result , new ArrayList<>() , new boolean[nums.length]);
        return result;
    }
    public static void helper(int[] nums , List<List<Integer>> result , List<Integer> path , boolean[] used){

        if(path.size() == nums.length && !result.contains(path)){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=0 ; i<nums.length ; i++){
                //skip if we get the same element.
            if(used[i]) continue;

            path.add(nums[i]);
            used[i] = true;
            helper(nums , result , path , used);
            used[i] = false;
            path.remove(path.size()-1);
        }
    }
}