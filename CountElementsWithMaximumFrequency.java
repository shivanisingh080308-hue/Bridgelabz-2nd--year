import java.util.*;
public class CountElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num,0) + 1);
        }

        int maxFreq = 0;
        int totalCount = 0;
        for (int val : freq.values()) {
            if (val > maxFreq) {
                maxFreq = val;
            }
        }
        for (int val : freq.values()) {
            if (val == maxFreq) {
                totalCount += val;
            }
        }

        return totalCount;
    }
}
