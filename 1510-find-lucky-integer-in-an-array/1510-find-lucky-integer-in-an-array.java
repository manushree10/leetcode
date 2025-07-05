class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer>freq=new HashMap<>();
        for(int a:arr)
        {
            freq.put(a,freq.getOrDefault(a,0)+1);

        }
        int maxl=-1;
        for(int k:freq.keySet())
        {
            if(k==freq.get(k))
            {
                maxl=Math.max(maxl,k);
            }
        }
        return maxl;
    }
}