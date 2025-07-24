class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        
        int min=nums[0]*nums[1];
        int max=nums[n-2]*nums[n-1];

        return max-min;
        
    }
}