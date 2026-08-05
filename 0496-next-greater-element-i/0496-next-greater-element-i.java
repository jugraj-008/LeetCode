class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int n = nums1.length;
        int m = nums2.length;
        for(int i = m-1 ; i>=0 ; i--){
            while(!st.isEmpty() && st.peek() < nums2[i]){
                st.pop();
            }
            //Current = 4 Stack = Empty No greater element exists. Store
            if(st.isEmpty()){
                map.put(nums2[i] , -1);
            }
            else{
                map.put(nums2[i] , st.peek());
            }
            // to store next greater.
            st.push(nums2[i]);
        }
        int[] ans  = new int[n];
        for(int i=0 ; i<n ; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;

        
        
    }
}