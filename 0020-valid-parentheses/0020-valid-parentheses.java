class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0 ; i<n ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(')');
            }
            else if(ch == '['){
                st.push(']');
            }
            else if(ch == '{'){
                st.push('}');
            }
            else{ 
                if(st.isEmpty() || ch != st.pop()){
                return false;
            }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
        
    }
}