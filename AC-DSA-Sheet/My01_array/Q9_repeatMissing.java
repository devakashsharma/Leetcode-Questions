public class Q9_repeatMissing {
    static int[] repeatMissing(int[] arr) {
        int n = arr.length;
        long sum = 0, squareSum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            squareSum += (long) arr[i] * arr[i];
        }

        // value of sum and sq sum
        System.out.println("sum: " + sum);
        System.out.println("sq sum: " + squareSum);
        
        long expectedSum = (long) n * (n + 1) / 2;
        System.out.println("expected sum: " + expectedSum);

        long expectedSquareSum = (long) n * (n + 1) * (2 * n + 1) / 6;
        System.out.println("expected sq sum: " + expectedSquareSum);

        long diffSum = sum - expectedSum;
        System.out.println("diff sum: " + diffSum);

        long diffSquareSum = squareSum - expectedSquareSum;
        System.out.println("diff sq sum: " + diffSquareSum);

        long add = diffSquareSum / diffSum;
        System.out.println("add: " + add);

        long repeat = (add + diffSum) / 2;
        System.out.println("repeat: " + repeat);

        long missing = repeat - diffSum;
        System.out.println("missing: " + missing);

        return new int[]{(int) missing, (int) repeat};
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 2, 1, 1 };

        int[] res = repeatMissing(arr);
        System.out.println("missing element: " + res[0]);
        System.out.println("repeat element: " + res[1]);
    }
}
