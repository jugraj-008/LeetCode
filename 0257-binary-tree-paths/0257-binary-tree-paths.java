class Solution {

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> ans = new ArrayList<>();

        helper(root, "", ans);

        return ans;
    }

    void helper(TreeNode root,String path,List<String> ans){

        // Base case
        if(root == null){
            return;
        }

        // Leaf node found
        if(root.left == null && root.right == null){
            ans.add(path + root.val);
            return;
        }

        // Go left
        helper(root.left,path + root.val + "->",ans);

        // Go right
        helper(root.right,path + root.val + "->",ans);
    }
}