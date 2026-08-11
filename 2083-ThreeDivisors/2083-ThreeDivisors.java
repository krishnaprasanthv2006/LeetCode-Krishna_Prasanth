// Last updated: 11/08/2026, 14:14:42
class Solution {
    public boolean isThree(int n) {
        int root = (int) Math.sqrt(n);
        if (root * root != n) return false;
        for (int i = 2; i * i <= root; i++) {
            if (root % i == 0) {
                return false;
            }
        }
        return root > 1;
    }
}
