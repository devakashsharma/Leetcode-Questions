import java.util.Arrays;

public class Q20_commonPrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }

            StringBuilder prefix = new StringBuilder();

            Arrays.sort(strs);

            String first = strs[0];
            String last = strs[strs.length - 1];

            for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
                if (first.charAt(i) != last.charAt(i)) {
                    return prefix.toString();
                }

                prefix.append(first.charAt(i));
            }

            return prefix.toString();
        }
    }
}
