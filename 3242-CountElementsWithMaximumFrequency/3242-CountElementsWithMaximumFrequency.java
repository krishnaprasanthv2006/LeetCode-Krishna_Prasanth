// Last updated: 11/08/2026, 14:13:27
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