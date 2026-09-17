// Last updated: 17/09/2026, 11:32:42
class Solution {
    public int countCompleteSubstrings(String word, int k) {
        int n = word.length();
        int ans = 0;

        for (int start = 0; start < n; ) {
            int end = start + 1;

            while (end < n && Math.abs(word.charAt(end) - word.charAt(end - 1)) <= 2) {
                end++;
            }

            for (int distinct = 1; distinct <= 26; distinct++) {
                int len = distinct * k;

                if (len > end - start) {
                    break;
                }

                int[] freq = new int[26];

                for (int i = start; i + len <= end; i++) {
                    if (i == start) {
                        for (int j = i; j < i + len; j++) {
                            freq[word.charAt(j) - 'a']++;
                        }
                    } else {
                        freq[word.charAt(i - 1) - 'a']--;
                        freq[word.charAt(i + len - 1) - 'a']++;
                    }

                    boolean valid = true;

                    for (int j = 0; j < 26; j++) {
                        if (freq[j] != 0 && freq[j] != k) {
                            valid = false;
                            break;
                        }
                    }

                    if (valid) {
                        ans++;
                    }
                }
            }

            start = end;
        }

        return ans;
    }
}