import java.util.Arrays;

public class Q11_hIndex {
    class Solution {
        public int hIndex(int[] citations) {
            Arrays.sort(citations);
            int n = citations.length;
            int h = 0;

            for (int i = n - 1; i >= 0; i--) {
                if (citations[i] >= (n - i)) {
                    h = n - i;
                } else {
                    break;
                }
            }

            return h;
        }
    }
}
