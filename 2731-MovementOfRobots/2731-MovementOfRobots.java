// Last updated: 30/09/2026, 09:18:11
import java.util.*;

class Solution {
    public int sumDistance(int[] nums, String s, int d) {
        int n = nums.length;
        long MOD = 1000000007;

        long[] pos = new long[n];

        // Calculate final positions
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R') {
                pos[i] = (long) nums[i] + d;
            } else {
                pos[i] = (long) nums[i] - d;
            }
        }

        // Sort positions
        Arrays.sort(pos);

        long ans = 0;
        long prefix = 0;

        // Calculate pairwise distances
        for (int i = 0; i < n; i++) {
            ans += pos[i] * i - prefix;
            ans %= MOD;

            prefix += pos[i];
        }

        return (int) ans;
    }
}