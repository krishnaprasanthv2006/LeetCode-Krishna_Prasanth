// Last updated: 08/09/2026, 10:12:20
import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int answer = 0;

        for (int count : freq.values()) {
            if (count > maxFreq) {
                maxFreq = count;
                answer = count;
            } else if (count == maxFreq) {
                answer += count;
            }
        }

        return answer;
    }
}