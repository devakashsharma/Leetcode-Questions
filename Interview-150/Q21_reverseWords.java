public class Q21_reverseWords {
    class Solution {
        public String reverseWords(String s) {
            StringBuilder str = new StringBuilder();
            String[] words = s.trim().split("\\s+");

            for (int i = words.length - 1; i >= 0; i--) {
                str.append(words[i]);
                if (i != 0)
                    str.append(" ");
            }

            return str.toString();
        }
    }
}
