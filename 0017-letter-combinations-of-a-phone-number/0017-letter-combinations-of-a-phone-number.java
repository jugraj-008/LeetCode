class Solution {
    String[] map = {
        "" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs"
        , "tuv" , "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0){ // invalid input.
            return result;
        }
        backtrack(digits , result , 0 , new StringBuilder());
        return result;
    }
    public  void backtrack(String digits , List<String> result , int index , StringBuilder path){
        // base case.
        if(index == digits.length()){
            result.add(path.toString());
            return;
        }
        String letters = map[digits.charAt(index) - '0'];
        // digits = "23" , index = 0 -> '2' - '0';
        //eventually map[2] -> "abc".
        for(int i=0 ; i<letters.length() ; i++){
            path.append(letters.charAt(i));
            backtrack(digits , result , index+1 , path);
            path.deleteCharAt(path.length() - 1);
        }
    }
}