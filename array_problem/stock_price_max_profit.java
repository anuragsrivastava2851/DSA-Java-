package array_problem;
/*
You  are  given  an  array prices where prices[i] is  the  
price  of  a  given  stock  on  the ith day.Return the maximum profit you can achieve 
from this transaction. If you cannot achieve any profit, return 0 */

public class stock_price_max_profit {
    public int maxProfit(int[] prices) {
    int buy = prices[0];   // assume you bought on day 1
    int profit = 0;        // no profit yet

    for (int i = 1; i < prices.length; i++) {
        if (buy < prices[i]) {
            // today's price is HIGHER than what you "bought" at
            profit = Math.max(prices[i] - buy, profit);
        }
        else {
            // today's price is LOWER (or equal) — better buy day found
            buy = prices[i];
        }
    }
    return profit;
}
    public static void main(String args[]){
        stock_price_max_profit obj = new stock_price_max_profit();
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};

        int ans1 = obj.maxProfit(prices1);
        int ans2 = obj.maxProfit(prices2);

        System.out.println(ans1);
        System.out.println(ans2);
    }
}
