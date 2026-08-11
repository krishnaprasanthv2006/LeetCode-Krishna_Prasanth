// Last updated: 11/08/2026, 14:17:02
import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] answer = new String[n];

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = score[i]; // score
            arr[i][1] = i;        // original index
        }

        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        for (int rank = 0; rank < n; rank++) {
            int index = arr[rank][1];

            if (rank == 0)
                answer[index] = "Gold Medal";
            else if (rank == 1)
                answer[index] = "Silver Medal";
            else if (rank == 2)
                answer[index] = "Bronze Medal";
            else
                answer[index] = String.valueOf(rank + 1);
        }

        return answer;
    }
}