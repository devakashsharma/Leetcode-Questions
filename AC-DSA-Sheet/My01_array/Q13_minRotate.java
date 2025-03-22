public class Q13_minRotate {
    class Solution {
        public int findMin(int[] arr) {
            int low = 0, high = arr.length - 1;

            if (arr.length == 1 || arr[low] < arr[high]) {
                return arr[low];
            }

            while (low < high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] > arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }

            return arr[low];
        }
    }
}
