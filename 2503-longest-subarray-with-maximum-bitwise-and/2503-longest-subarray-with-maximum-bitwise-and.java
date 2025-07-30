class Solution {
    public int longestSubarray(int[] nums) {
        int maxVal = 0, ans = 0, currentStreak = 0;

        for (int num : nums) {
            if (maxVal < num) {
                maxVal = num;
                ans = currentStreak = 0;
            }

            if (maxVal == num) {
                currentStreak++;
            } else {
                currentStreak = 0;
            }

            ans = Math.max(ans, currentStreak);
        }
        return ans;

        // if (nums == null || nums.length == 0) {
        //     return 0;
        // }

        
        // int maxVal = 0;
        // for (int num : nums) {
        //     if (num > maxVal) {
        //         maxVal = num;
        //     }
        // }
        
        
        // int maxLen = 0;
        // int currentLen = 0;
        
        // for (int num : nums) {
        //     if (num == maxVal) {
        //         currentLen++;
        //     } else {
        //         maxLen = Math.max(maxLen, currentLen);
        //         currentLen = 0;
        //     }
        // }
        
       
        // return Math.max(maxLen, currentLen);
    }
}