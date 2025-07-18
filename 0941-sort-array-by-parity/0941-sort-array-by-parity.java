class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer>res=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0)
            {
                res.add(nums[i]);
                nums[i]=-1;

            }
        }
      for(int i=0;i<n;i++)
      {
        if(nums[i]!=-1)
        {
            res.add(nums[i]);
        }
      }
       return res.stream().mapToInt(Integer::intValue).toArray();
    }
}