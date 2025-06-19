class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int cnt=0;
        while(i<nums.length)
        {
            int sum=nums[i];
            i++;

            while(i<nums.length && nums[i]-sum<=k)
            {
                 i++;
            }
            cnt++;
        }
        return cnt;
    }
}