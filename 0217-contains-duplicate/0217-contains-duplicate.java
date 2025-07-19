class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            if(set.contains(num))
            {
                return true;
            }
            set.add(num);
        }
        return false;
        // int n=nums.length;
        // int cnt=0;
        // for(int i=0;i<n;i++)
        // {
        //     cnt=0;
        //     for(int j=0;j<n;j++)
        //     {
        //     if(nums[i]==nums[j])
        //     {
        //         cnt++;
        //     }
        //     if(cnt>=2)
        //     {
        //         return true;
        //     }
            
            
        // }
        // }
        // return false;
    }
}