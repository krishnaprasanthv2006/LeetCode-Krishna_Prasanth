// Last updated: 11/08/2026, 14:19:30
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            else if (price - min > profit) {
                profit = price - min;
            }
        }

        return profit;
    }
}