class Solution {
    public int longestValidParentheses(String s) {
        if(s.length() == 0) return 0;

        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int ans = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                st.push(i);
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
                if(st.isEmpty()){
                    st.push(i);
                }

                ans = Math.max(ans, i - st.peek());
            }
        }

        return ans;
    }
}