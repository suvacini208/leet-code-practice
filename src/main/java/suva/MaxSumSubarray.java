package suva;

public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] number = {2,3,4,1,5};
        int k = 2;
        long maxSum = 0;
        for(int i = 0; i < k; i++) {
            maxSum = maxSum + number[i];
        }
        long windowSum = maxSum;
        for(int i = k; i < number.length; i++) {
            windowSum = windowSum + number[i];
            windowSum = windowSum - number[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.print(maxSum);
    }
}