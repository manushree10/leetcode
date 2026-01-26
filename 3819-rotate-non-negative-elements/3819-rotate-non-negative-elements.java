class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int n=nums.length;
        int[] pos=new int[n];
        int m=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>=0)
            {
                pos[m++]=nums[i];
            }
        }
        if(m==0)
        {
            return nums;
        }
        k=k%m;
        for(int i=0,j=0;i<n;i++)
        {
            if(nums[i]>=0)nums[i]=pos[(j++ + k) % m];
        }
        return nums;
    }
}