class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        List<Integer>res=new ArrayList<>();
        int cnt=0;
        for(int num:nums)
        {
            map.put(num, map.getOrDefault(num,0)+1);
            
        }
        
        for(int n:map.keySet())
        {
            if(map.get(n)==2)
            {
               res.add(n);
            }
            
        }
        for(int m:res)
        {
            cnt^=m;
        }
        return cnt; 
    }
}