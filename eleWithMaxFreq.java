class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];  // constraint nums[i] <= 100
        
        // Step 1: Count frequency
        for (int num : nums) {
            freq[num]++;
        }

        // Step 2: Find maximum frequency
        int maxFreq = 0;
        for (int f : freq) {
            maxFreq = Math.max(maxFreq, f);
        }

        // Step 3: Sum frequencies equal to maxFreq
        int ans = 0;
        for (int f : freq) {
            if (f == maxFreq) {
                ans += f;
            }
        }

        return ans;
    }
}
