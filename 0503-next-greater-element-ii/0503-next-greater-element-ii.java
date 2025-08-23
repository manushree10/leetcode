class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
         Arrays.fill(res, -1);
        for(int i=0;i<n;i++)
        {
            
            for(int j=1;j<n;j++)
            {
                int nextIn = (i + j) % n;
                if(nums[nextIn]>nums[i])
                {
                    res[i]=nums[nextIn];
                    
                   
                   break;
                }
            }
            
        }
        return res;
    }
}