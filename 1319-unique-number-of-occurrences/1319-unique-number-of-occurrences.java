class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer>fmap=new HashMap<>();
        for(int a:arr)
        {
            fmap.put(a,fmap.getOrDefault(a,0)+1);
        }
        Set<Integer>s=new HashSet<>();

        for(int frq:fmap.values())
        {
            if(!s.add(frq))
            {
                return false;
            }
        }
        return true;
    }
}