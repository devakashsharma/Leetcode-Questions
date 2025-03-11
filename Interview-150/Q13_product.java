public class Q13_product {
    class Solution {

        // brute force
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] arr = new int[n];
    
            for(int i = 0; i < n; i++) {
                int num = 1;
                
                for (int j = 0; j < n; j++) {
                    if (nums[i] != nums[j]) {
                        num *= nums[j];
                    }
    
                    arr[i] = num;
                }
            }
    
            return arr;
        }

        // optimal
        public int[] optimalProductExceptSelf(int[] nums) {
            int n = nums.length;
            int[] prefix = new int[n];
            int[] suffix = new int[n];
            prefix[0] = 1;
            suffix[n - 1] = 1;
    
            for (int i = 1; i < n; i++) {
                prefix[i] = prefix[i - 1] * nums[i - 1];
            }
    
            for (int i = n - 2; i >= 0; i--) {
                suffix[i] = suffix[i + 1] * nums[i + 1];
            }
    
            int[] arr = new int[n];
    
            for (int i = 0; i < n; i++) {
                arr[i] = prefix[i] * suffix[i];
            }
    
            return arr;
        }
    }
}
