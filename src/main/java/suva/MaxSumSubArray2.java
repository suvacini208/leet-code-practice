package suva;

public class MaxSumSubArray2 {
    public static void main(String[] args) {
        int[] numbers =  {2, 1, 5, 1, 3, 2};
        int k = 3, maxSum = 0;
        for(int i = 0; i < k; i++) {
            maxSum = maxSum + numbers[i];
        }

        int window = maxSum;
        for(int i = k; i < numbers.length; i++) {
            window = window + numbers[i];
            window = window - numbers[i-k];
            maxSum = Math.max(maxSum, window);
        }
        System.out.println(maxSum);
    }
}
