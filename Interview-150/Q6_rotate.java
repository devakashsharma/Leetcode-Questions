public class Q6_rotate {
    class Solution {
        // reverse method
        public static void reverse(int[] nums, int start, int end) {
            while (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        // rotate method
        public void rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % n;

            // reverse the last kth element
            reverse(nums, (n - k), n - 1);

            // reverse the previous
            reverse(nums, 0, n - k - 1);

            // reverse entire array
            reverse(nums, 0, n - 1);
        }
    }
}
