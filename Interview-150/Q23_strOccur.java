public class Q23_strOccur {
    class Solution {
        public int strStr(String haystack, String needle) {
            int m = haystack.length();
            int n = needle.length();
    
            for (int i = 0; i < m - n; i++) {
                int j = 0;
                while (j < n && haystack.charAt(i + j) == needle.charAt(j)) {
                    j++;
                }
    
                if (j == n) {
                    return i;
                }
            }
    
            return -1;
        }

        static int anotherSol (String haystack, String needle) {
            if (needle.isEmpty()) {
                return 0;
            }

            for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
                if(haystack.substring(i,j).equals(needle)){
                    return i;
                }
            }
            return -1;
        }
    }
}
