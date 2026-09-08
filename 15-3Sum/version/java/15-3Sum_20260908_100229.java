// Last updated: 08/09/2026, 10:02:29
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> threeSum(int[] nums) {
5        Arrays.sort(nums);
6        List<List<Integer>> result = new ArrayList<>();
7
8        for (int i = 0; i < nums.length - 2; i++) {
9            if (i > 0 && nums[i] == nums[i - 1]) {
10                continue;
11            }
12
13            int left = i + 1;
14            int right = nums.length - 1;
15
16            while (left < right) {
17                int sum = nums[i] + nums[left] + nums[right];
18
19                if (sum == 0) {
20                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
21
22                    left++;
23                    right--;
24
25                    while (left < right && nums[left] == nums[left - 1]) {
26                        left++;
27                    }
28
29                    while (left < right && nums[right] == nums[right + 1]) {
30                        right--;
31                    }
32                } else if (sum < 0) {
33                    left++;
34                } else {
35                    right--;
36                }
37            }
38        }
39
40        return result;
41    }
42}