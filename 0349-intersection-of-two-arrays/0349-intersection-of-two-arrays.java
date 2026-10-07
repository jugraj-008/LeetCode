import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();

        for (int x : nums1) {
            set1.add(x);
        }

        Set<Integer> resultSet = new HashSet<>();

        for (int x : nums2) {
            if (set1.contains(x)) {
                resultSet.add(x);
            }
        }

        int[] ans = new int[resultSet.size()];
        int i = 0;

        for (int x : resultSet) {
            ans[i++] = x;
        }

        return ans;
    }
}