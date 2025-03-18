public class Q8_stockTime {
    class Solution {
        public int maxProfit(int[] arr) {
            int n = arr.length;
            if (n == 0)
                return 0;

            int buy = Integer.MAX_VALUE;
            int sell = 0;

            for (int i = 0; i < n; i++) {
                buy = Math.min(buy, arr[i]);
                sell = Math.max(sell, arr[i] - buy);
            }

            return sell;
        }
    }
}
