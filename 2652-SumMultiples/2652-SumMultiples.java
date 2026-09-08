// Last updated: 08/09/2026, 10:12:42
public class Solution {
    public int sumOfMultiples(int n) {
        return sumOfDivisible(n, 3)
             + sumOfDivisible(n, 5)
             + sumOfDivisible(n, 7)
             - sumOfDivisible(n, 15)
             - sumOfDivisible(n, 21)
             - sumOfDivisible(n, 35)
             + sumOfDivisible(n, 105);
    }
    private int sumOfDivisible(int n, int k) {
        int m = n / k;              
        return k * m * (m + 1) / 2;     
    }
}
