class Solution {
    public int majorityElement(int[] nums) {
        int n1=nums.length;
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>en:map.entrySet())
        {
            if(en.getValue()>n1/2)
            {
                return en.getKey();
            }
        }
        return -1;
    }
}