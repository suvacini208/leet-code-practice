package suva;
public class StockBuySell {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int minPrice = 7;
        int maxProfit = 0;
        for(int i = 1; i< prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i]-minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        System.out.println(maxProfit);
    }
}