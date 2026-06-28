package suva;

import java.util.Arrays;

public class CoinBase {

    public static void main(String[] args) {
        int[] coins = {1, 5, 10};
        int target = 11;

        int[] dp = new int[target +1];
        Arrays.fill(dp, target+1);
        dp[0]=0;

        for(int i = 1; i < dp.length; i++) {
            for(int coin : coins) {
                if(coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i-coin]+1);
                }  
            }
        }

        for(int num : dp) {
            System.out.println(num);
        }
        System.out.print(dp[target]);

    }
    
}
