// Last updated: 08/09/2026, 10:11:48
class Solution {
    public boolean canReach(int[] start, int[] target) {
        int startSum = start[0]+start[1];
        int targetSum = target[0]+target[1];
        return (startSum % 2) == (targetSum %2);
    }
}