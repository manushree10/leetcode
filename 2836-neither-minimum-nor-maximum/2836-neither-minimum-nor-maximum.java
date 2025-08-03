class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=1;i<n-1;i++)
        {
            return nums[i];
        }
        return -1;
    }
}