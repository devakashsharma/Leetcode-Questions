public class Q14_pairSum {
    class Solution {
        static boolean pairInSortedRotated(int arr[], int target) {
            int n = arr.length;
            int i;

            for (i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    break;
                }
            }

            int left = (i + 1) % n;
            int right = i;

            while (left != right) {
                if (arr[left] + arr[right] == target) {
                    return true;
                }

                if (arr[left] + arr[right] < target) {
                    left = (left + 1) % n;
                } else {
                    right = (n + right - 1) % n;
                }
            }

            return false;
        }
    }
}
