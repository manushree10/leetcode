class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer>seen=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=-1)
            {
                seen.add(nums[i]);
                k=seen.size();
            }
            else if(k==0)
            {
                ans.add(-1);
            }
            else
            {
                ans.add(seen.get(--k));
            }
        }
        return ans;
    }
}