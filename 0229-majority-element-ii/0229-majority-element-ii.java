class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer>m=new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int num:nums)
        {
            m.put(num,m.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() > n / 3) {
                res.add(entry.getKey());
            }
        }
       return res;
    }
}