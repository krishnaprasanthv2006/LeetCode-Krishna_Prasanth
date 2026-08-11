// Last updated: 11/08/2026, 14:14:59
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = 0;
        int empty = 0;

        while (numBottles > 0) {
            totalDrank += numBottles;
            empty += numBottles;
            numBottles = empty / numExchange;
            empty = empty % numExchange;
        }

        return totalDrank;
    }
}
