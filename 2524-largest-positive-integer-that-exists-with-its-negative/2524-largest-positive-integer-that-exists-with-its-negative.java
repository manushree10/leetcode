class Solution {
    public int findMaxK(int[] nums) {
    //     int n=nums.length;
    //     Arrays.sort(nums);
    //    int l=0;
    //    int r=nums.length-1;
       
    //    while(l<r)
    //    {
    //       int sum=nums[l]+nums[r];
    //       if(sum==0)
    //       {
    //         return nums[r];
    //       }
    //       else if(sum<0)
    //       {
    //         l++;
    //       }
    //       else
    //       {
    //         r--;
    //       }
    //    }
       
    //    return -1;
     
    Set<Integer>s=new HashSet<>();
      int maxx=-1;
      for(int num:nums)
      {
        if(s.contains(-num))
        {
            maxx= Math.max(maxx,Math.abs(num));

        }
        s.add(num);
      }
      return maxx;
    }
}