// Last updated: 11/08/2026, 14:15:30
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2001];

        for (int num : arr) {
            freq[num + 1000]++;
        }

        boolean[] seen = new boolean[1001];

        for (int count : freq) {
            if (count > 0) {
                if (seen[count]) {
                    return false;
                }
                seen[count] = true;
            }
        }

        return true;
    }
}