class Solution {
    public int smallestRangeI(int[] nums, int k) {
        
    int min = nums[0], max = nums[0];

        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return Math.max(0, max - min - 2 * k);
    }
}