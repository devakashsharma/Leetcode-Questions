public class Q22_zigzag {
    class Solution {
        public String convert(String s, int numRows) {
            if (numRows == 1) {
                return s;
            }

            StringBuilder[] str = new StringBuilder[numRows];
            for (int i = 0; i < numRows; i++) {
                str[i] = new StringBuilder();
            }

            int row = 0;
            boolean isGoingDown = false;
            for (char c : s.toCharArray()) {
                str[row].append(c);

                if (row == 0 || row == numRows - 1) {
                    isGoingDown = !isGoingDown;
                }

                row = row + (isGoingDown ? 1 : -1);
            }

            StringBuilder result = new StringBuilder();
            for (StringBuilder sb : str) {
                result.append(sb);
            }

            return result.toString();
        }
    }
}
