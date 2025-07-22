class Solution {
    public void moveZeroes(int[] nums) {
        
        //    int left = 0;  

        // for (int right = 0; right < nums.length; right++) {
        //     if (nums[right] != 0) {
                
        //         int temp = nums[left];
        //         nums[left] = nums[right];
        //         nums[right] = temp;

        //         left++;
        //     }
        // }
         int indx=0;
         for(int num:nums)
         {
            if(num!=0)
            {
                nums[indx]=num;
                indx++;
            }
         }
         while(indx<nums.length)
         {
            nums[indx]=0;
            indx++;
         }
    }
}