import java.util.Arrays;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for (int i = 0; i < n; i++) {

            // Find nums1[i] in nums2
            int index = -1;
            for (int j = 0; j < m; j++) {
                if (nums2[j] == nums1[i]) {
                    index = j;
                    break;
                }
            }

            // Search for next greater element
            for (int j = index + 1; j < m; j++) {
                if (nums2[j] > nums1[i]) {
                    ans[i] = nums2[j];
                    break;
                }
            }
        }

        return ans;
    }
}