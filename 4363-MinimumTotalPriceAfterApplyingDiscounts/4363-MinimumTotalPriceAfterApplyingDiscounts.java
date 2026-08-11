// Last updated: 11/08/2026, 14:12:49
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        int n = prices.length;
        int m = discounts.length;

        double total = 0;
        int i =n-1;
        int j =m-1;

        while(i>=0 && j>=0){
            total += (prices[i] * (100.0 -discounts[j]))/100.0;
            i--;
            j--;
        }
        while (i>=0){
            total += prices[i];
            i--;
        }
        return total;
    }
}