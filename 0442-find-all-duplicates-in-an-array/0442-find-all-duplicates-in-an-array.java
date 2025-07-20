class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> feq=new HashMap<>();
        List<Integer>res=new ArrayList<>();
        for(int num:nums)
        {
            feq.put(num,feq.getOrDefault(num,0)+1);
        }
        for(int n:feq.keySet())
        {
            if(feq.get(n)>1)
            {
                 res.add(n);
            }
        }
        return res;
    }
}