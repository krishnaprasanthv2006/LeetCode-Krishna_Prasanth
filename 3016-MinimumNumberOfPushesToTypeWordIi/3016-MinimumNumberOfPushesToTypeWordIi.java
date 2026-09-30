// Last updated: 30/09/2026, 09:17:56
class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        Arrays.sort(freq);

        int pushes = 0;
        int pressCount = 1;
        int charsUsed = 0;

        // Start from highest frequency
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0)
                break;

            pushes += freq[i] * pressCount;
            charsUsed++;

            if (charsUsed % 8 == 0) {
                pressCount++;
            }
        }

        return pushes;
    }
}