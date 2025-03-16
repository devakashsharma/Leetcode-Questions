public class Q6_rotateSearch {
    class Solution {
        public int search(int[] arr, int x) {
            int low = 0, high = arr.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] == x) {
                    return mid;
                }

                if (arr[low] <= arr[mid]) {
                    if (arr[low] <= x && x < arr[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                } else {
                    if (arr[mid] < x && x <= arr[high]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }

            return -1;
        }
    }
}
