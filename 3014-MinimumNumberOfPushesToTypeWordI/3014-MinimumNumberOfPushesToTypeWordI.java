// Last updated: 08/09/2026, 10:12:15
class Solution {
    public int minimumPushes(String word) {

        int pushes = 0;

        for (int i = 0; i < word.length(); i++) {
            pushes += (i / 8) + 1;
        }

        return pushes;
    }
}