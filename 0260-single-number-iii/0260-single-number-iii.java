class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer>f=new HashMap<>();
        List<Integer>res=new ArrayList<>();
        for(int n:nums)
        {
            f.put(n,f.getOrDefault(n,0)+1);
        }
        for(int num:f.keySet())
        {
            if(f.get(num)==1)
            {
                res.add(num);
                
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}