class Solution {
    public int firstUniqueFreq(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer>freq=new LinkedHashMap<>();
        for(int num:nums)
        {
           freq.put(num,freq.getOrDefault(num,0)+1);
        }
         Map<Integer,Integer>cnt=new HashMap<>();
        for(int n1:freq.values())
        {
           cnt.put(n1,cnt.getOrDefault(n1,0)+1);
        }

        for(Map.Entry<Integer,Integer>ent:freq.entrySet())
        {
            int val=ent.getValue();
            int k=ent.getKey();
            if(cnt.get(val)==1)
            {
                return k;
            }
           
        }
      return -1;
    }
}