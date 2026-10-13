import java.util.*;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        solve(root, result);
        return result;
    }

    private void solve(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        solve(root.left, result);   // 1. Left
        solve(root.right, result);  // 2. Right
        result.add(root.val);       // 3. Root
    }
}