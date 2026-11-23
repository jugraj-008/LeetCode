class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s , result , 0 , new ArrayList<>());
        return result;
    }
    public static void backtrack(String s , List<List<String>> result , int index , List<String> path){
        if(index == s.length()){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int end = index ; end < s.length() ; end++){
            if(isPalidrome(s , index , end)){
                path.add(s.substring(index , end+1));
                backtrack(s , result , end+1 , path );
                path.remove(path.size() - 1);


            }
        }

    }
    public static boolean isPalidrome(String s , int index , int end ){
        int left = index;
        int right = end;
        while(left < right){
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;

    }
}