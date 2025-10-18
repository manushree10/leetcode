class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;
        int pre = Integer.MIN_VALUE;

        for (int num : nums) {
            int cur = Math.max(num - k, pre + 1);
            if (cur <= num + k) {
                ans++;
                pre = cur;
            }
        }

        return ans;
    }
}