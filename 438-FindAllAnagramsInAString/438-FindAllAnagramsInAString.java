// Last updated: 11/09/2026, 09:28:16
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] count = new int[26];

        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }

        int left = 0;
        int right = 0;
        int remaining = p.length();

        while (right < s.length()) {
            char c = s.charAt(right);

            if (count[c - 'a'] > 0) {
                remaining--;
            }

            count[c - 'a']--;
            right++;

            if (right - left == p.length()) {
                if (remaining == 0) {
                    result.add(left);
                }

                char leftChar = s.charAt(left);

                if (count[leftChar - 'a'] >= 0) {
                    remaining++;
                }

                count[leftChar - 'a']++;
                left++;
            }
        }

        return result;
    }
}