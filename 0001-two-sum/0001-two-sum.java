class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>idx=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            if(idx.containsKey(target-num))
            {
                return new int[]{i,idx.get(target-num)};
            }
            idx.put(num,i);
        }
       return new int[]{};
    }
}