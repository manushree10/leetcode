class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> s=new HashSet<>();
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==key)
            {
                for(int i=j-k;i<=j+k;i++)
                {
                    if (i >= 0 && i < nums.length){
                    s.add(i);
                    }
                }
            }
        }

        List<Integer> res=new ArrayList<>(s);
        Collections.sort(res);
        return res;
        
    }
}