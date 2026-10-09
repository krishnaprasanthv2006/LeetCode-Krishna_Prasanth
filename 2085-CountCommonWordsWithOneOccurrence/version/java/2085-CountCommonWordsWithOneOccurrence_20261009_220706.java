// Last updated: 09/10/2026, 22:07:06
1class Solution {
2    public int countWords(String[] words1, String[] words2) {
3        Map<String, Integer> map1 = new HashMap<>();
4        Map<String, Integer> map2 = new HashMap<>();
5
6        for (String word : words1)
7            map1.put(word, map1.getOrDefault(word, 0) + 1);
8
9        for (String word : words2)
10            map2.put(word, map2.getOrDefault(word, 0) + 1);
11
12        int count = 0;
13
14        for (String word : map1.keySet()) {
15            if (map1.get(word) == 1 && map2.getOrDefault(word, 0) == 1)
16                count++;
17        }
18
19        return count;
20    }
21}