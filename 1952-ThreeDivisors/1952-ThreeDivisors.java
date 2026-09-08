// Last updated: 08/09/2026, 10:13:29
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
