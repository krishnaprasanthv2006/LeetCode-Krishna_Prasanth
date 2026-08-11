// Last updated: 11/08/2026, 14:13:43
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {

        HashSet<String> set = new HashSet<>();

        for (String word : words) {
            set.add(word);
        }

        int count = 0;

        for (String word : words) {

            if (!set.contains(word))
                continue;

            String rev = "" + word.charAt(1) + word.charAt(0);

            if (set.contains(rev) && !word.equals(rev)) {
                count++;
                set.remove(word);
                set.remove(rev);
            }
        }

        return count;
    }
}