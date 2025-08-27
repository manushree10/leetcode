class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
        boolean leftCheck = (i - k >= 0) ? nums[i] > nums[i - k] : true;
            boolean rightCheck = (i + k < n) ? nums[i] > nums[i + k] : true;

            if (leftCheck && rightCheck) {
                sum += nums[i];
            }
        }
        return sum;
    }
}