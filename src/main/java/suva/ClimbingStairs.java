package suva;
public class ClimbingStairs {
    public static void main(String[] args) {
        int numberOfSteps = 5;
        int[] dp = new int[numberOfSteps+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i < dp.length; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[numberOfSteps]);
    }
}