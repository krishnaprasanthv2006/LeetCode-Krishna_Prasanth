// Last updated: 08/09/2026, 10:12:51
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;

        int takeOnes = Math.min(numOnes, k);
        sum += takeOnes;
        k -= takeOnes;

        int takeZeros = Math.min(numZeros, k);
        k -= takeZeros;

        sum -= k;

        return sum;
    }
}
