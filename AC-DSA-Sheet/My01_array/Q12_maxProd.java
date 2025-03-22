public class Q12_maxProd {
    class Solution {
        public int maxProduct(int[] arr) {
            int n = arr.length;
            int prefix = 1;
            int suffix = 1;
            int sum = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                if (prefix == 0) {
                    prefix = 1;
                }
                if (suffix == 0) {
                    suffix = 1;
                }

                prefix *= arr[i];
                suffix *= arr[n - i - 1];
                sum = Math.max(sum, Math.max(prefix, suffix));
            }

            return sum;
        }
    }
}