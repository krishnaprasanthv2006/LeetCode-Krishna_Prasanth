// Last updated: 11/08/2026, 14:13:30
import java.util.*;

class Solution {
    private final Map<Long, Integer> memo = new HashMap<>();

    public int maxPartitionsAfterOperations(String s, int k) {
        return dfs(s, 0, true, 0, k) + 1;
    }

    private int dfs(String s, int i, boolean canChange, int mask, int k) {
        if (i == s.length())
            return 0;

        long key = ((long) i << 27) | ((canChange ? 1L : 0L) << 26) | mask;
        if (memo.containsKey(key))
            return memo.get(key);

        int ans = solve(s, i, canChange, mask, 1 << (s.charAt(i) - 'a'), k);

        if (canChange) {
            for (int j = 0; j < 26; j++) {
                ans = Math.max(ans, solve(s, i, false, mask, 1 << j, k));
            }
        }

        memo.put(key, ans);
        return ans;
    }

    private int solve(String s, int i, boolean canChange, int mask, int bit, int k) {
        int newMask = mask | bit;

        if (Integer.bitCount(newMask) > k) {
            return 1 + dfs(s, i + 1, canChange, bit, k);
        }

        return dfs(s, i + 1, canChange, newMask, k);
    }
}