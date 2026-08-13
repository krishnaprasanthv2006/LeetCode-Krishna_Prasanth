// Last updated: 13/08/2026, 14:53:49
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        HashSet<Integer> set = new HashSet<>();
4
5        for (int i = 0; i < nums.length; i++) {
6            if (set.contains(nums[i])) {
7                return true;
8            }
9
10            set.add(nums[i]);
11
12            if (set.size() > k) {
13                set.remove(nums[i - k]);
14            }
15        }
16
17        return false;
18    }
19}