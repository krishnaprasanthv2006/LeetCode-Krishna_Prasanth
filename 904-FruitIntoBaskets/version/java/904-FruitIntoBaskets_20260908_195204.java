// Last updated: 08/09/2026, 19:52:04
1import java.util.*;
2
3class Solution {
4    public int totalFruit(int[] fruits) {
5        Map<Integer, Integer> map = new HashMap<>();
6        int left = 0;
7        int max = 0;
8
9        for (int right = 0; right < fruits.length; right++) {
10            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
11
12            while (map.size() > 2) {
13                map.put(fruits[left], map.get(fruits[left]) - 1);
14
15                if (map.get(fruits[left]) == 0) {
16                    map.remove(fruits[left]);
17                }
18
19                left++;
20            }
21
22            max = Math.max(max, right - left + 1);
23        }
24
25        return max;
26    }
27}