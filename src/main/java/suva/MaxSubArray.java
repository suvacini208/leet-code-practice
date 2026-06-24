package suva;

public class MaxSubArray {
    public static void main(String[] args) {
        int num[] = {-2, -1, -3};
        // [-2, 1, -3, 4, -1, 2, 1, -5, 4]
        int currentSum = num[0], maxSum = num[0];
        for(int i = 1; i < num.length; i++) {
            currentSum = Math.max(num[i], currentSum+num[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.print(maxSum);
    }
}
