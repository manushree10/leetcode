class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n1=nums.length;
        Arrays.sort(nums);
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        List<Map.Entry<Integer,Integer>>en=new ArrayList<>(freq.entrySet());
        en.sort((a,b)->b.getValue()-a.getValue());
        int[] res=new int[k];
        for(int i=0;i<k;i++)
        {
            res[i]=en.get(i).getKey();
        }
        return res;
        
        
        // return freq.entrySet()
        //         .stream()
        //         .sorted((a, b) -> b.getValue() - a.getValue())  
        //         .limit(k)                                     
        //         .mapToInt(e -> e.getKey())                     
        //         .toArray();     

    }
}