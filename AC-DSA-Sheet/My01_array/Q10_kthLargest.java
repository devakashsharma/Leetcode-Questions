import java.util.Arrays;

public class Q10_kthLargest {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            Arrays.sort(nums);
            return nums[nums.length - k];
        }
    }
}
