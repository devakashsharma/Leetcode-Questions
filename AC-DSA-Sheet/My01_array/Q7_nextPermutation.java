public class Q7_nextPermutation {
    class Solution {

        // swap
        static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // reverse
        static void reverse(int[] arr, int i) {
            int j = arr.length - 1;
            while (i < j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        // next permutation
        public void nextPermutation(int[] nums) {
            int n = nums.length;
            int i = n - 2;

            while (i >= 0 && nums[i] >= nums[i + 1]) {
                i--;
            }

            if (i >= 0) {
                int j = n - 1;

                while (nums[j] <= nums[i]) {
                    j--;
                }
                swap(nums, i, j);
            }

            reverse(nums, i + 1);
        }
    }
}
