public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        class Solution {
            public int maxProfit(int[] prices) {
                if(prices.length==0)return 0;

                int profit = 0;
                int minProfit = prices[0];
                int maxProfit = 0;

                for(int stockPrice : prices){
                    minProfit = Math.min(minProfit, stockPrice);
                    profit = stockPrice - minProfit;
                    maxProfit = Math.max(profit, maxProfit);
                }
                return maxProfit;
            }
        }
    }
}
