class Solution {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int n:map.keySet())
        {
            if(map.get(n)==1)
            {
                return n;
            }
        }
        return -1;
    }
}