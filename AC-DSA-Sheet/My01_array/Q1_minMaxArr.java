public class Q1_minMaxArr {
    static void minMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } 
            
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum value is: " + min);
        System.out.println("Maximum value is: " + max);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        minMax(arr);
    }
}
