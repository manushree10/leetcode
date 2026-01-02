class Solution {
    public int repeatedNTimes(int[] nums) {
       Map<Integer,Integer>map=new HashMap<>();
       for(int n:nums)
       {
        map.put(n,map.getOrDefault(n,0)+1);
       }
       for(Map.Entry<Integer,Integer>m1: map.entrySet())
       {
         if(m1.getValue()>1)
         {
            return m1.getKey();
         }
       }
       return -1;
    }
}