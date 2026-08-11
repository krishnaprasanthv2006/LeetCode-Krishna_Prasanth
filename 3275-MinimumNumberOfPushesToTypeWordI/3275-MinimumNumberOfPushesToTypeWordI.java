// Last updated: 11/08/2026, 14:13:24
class Solution {
    public int minimumPushes(String word) {

        int pushes = 0;

        for (int i = 0; i < word.length(); i++) {
            pushes += (i / 8) + 1;
        }

        return pushes;
    }
}