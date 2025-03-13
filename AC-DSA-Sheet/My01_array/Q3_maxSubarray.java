public class Q3_maxSubarray {
    static void maxSubarray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            max = Math.max(max, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println("Maximum subarray sum is: " + max);
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubarray(arr);
    }
}
