class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int cnt=0;
        // int[] res= new int[n];
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            cnt=0;
            for(int j=0;j<n;j++)
            {
                if(nums[j]<nums[i])
                {
                    cnt++;
                }
                
            }
            res.add(cnt);
        }
       return  res.stream().mapToInt(Integer::intValue).toArray();
    }
}