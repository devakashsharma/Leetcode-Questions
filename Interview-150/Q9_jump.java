public class Q9_jump {
    class Solution {
        public boolean canJump(int[] nums) {
            int n = nums.length;
            int index = 0;

            for (int i = 0; i < n; i++) {
                if (i > index) {
                    return false;
                }

                index = Math.max(index, i + nums[i]);

                if (index >= n - 1) {
                    return true;
                }
            }

            return true;
        }
    }
}
