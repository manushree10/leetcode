class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        List<Integer>res=new ArrayList<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int n:map.keySet())
        {
            if(map.get(n)>=2)
            {
                res.add(n);
            }
        }
        return res.stream()
               .mapToInt(Integer::intValue)
               .toArray();
    }
}