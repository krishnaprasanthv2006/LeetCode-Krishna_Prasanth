// Last updated: 08/09/2026, 10:13:44
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
