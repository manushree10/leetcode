class Solution {
    public int removeDuplicates(int[] nums) {
        int s=2;
        for(int f=2;f<nums.length;f++)
        {
            if(nums[f]!=nums[s-2])
            {
                nums[s]=nums[f];
                s++;
            }
        }
        return s;
    }
}