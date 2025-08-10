class Solution {
    public List<Integer> majorityElement(int[] nums) {
    //     int n=nums.length;
    //     Map<Integer,Integer>m=new HashMap<>();
    //     List<Integer> res = new ArrayList<>();
    //     for(int num:nums)
    //     {
    //         m.put(num,m.getOrDefault(num,0)+1);
    //     }
    //     for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
    //         if (entry.getValue() > n / 3) {
    //             res.add(entry.getKey());
    //         }
    //     }
    //    return res;
    int n= nums.length;
        Map<Integer , Integer> map= new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i : nums){
            map.put(i , map.getOrDefault(i ,0)+1);
            if(map.get(i) > n/3 && !result.contains(i)){
                result.add(i);
            }
        }
        return result;

    }
}