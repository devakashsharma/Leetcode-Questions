public class Q19_lastLength {
    class Solution {
        public int lengthOfLastWord(String s) {
            int length = 0;
            int space = s.length() - 1;
            while (space >= 0 && s.charAt(space) == ' ') {
                space--;
            }

            while (space >= 0 && s.charAt(space) != ' ') {
                length++;
                space--;
            }

            return length;
        }
    }
}
