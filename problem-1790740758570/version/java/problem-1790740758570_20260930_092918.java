// Last updated: 30/09/2026, 09:29:18
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> findWinners(int[][] matches) {
5        Map<Integer, Integer> losses = new HashMap<>();
6        Set<Integer> players = new HashSet<>();
7
8        for (int[] match : matches) {
9            int winner = match[0];
10            int loser = match[1];
11
12            players.add(winner);
13            players.add(loser);
14
15            losses.put(loser, losses.getOrDefault(loser, 0) + 1);
16        }
17
18        List<Integer> zeroLoss = new ArrayList<>();
19        List<Integer> oneLoss = new ArrayList<>();
20
21        for (int player : players) {
22            int loss = losses.getOrDefault(player, 0);
23
24            if (loss == 0) {
25                zeroLoss.add(player);
26            } else if (loss == 1) {
27                oneLoss.add(player);
28            }
29        }
30
31        Collections.sort(zeroLoss);
32        Collections.sort(oneLoss);
33
34        return Arrays.asList(zeroLoss, oneLoss);
35    }
36}