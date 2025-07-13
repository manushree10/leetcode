class Solution {
    public int findSpecialInteger(int[] arr) {
        
        Map<Integer,Integer>m=new HashMap<>();
        int max=arr.length/4;
        for(int num:arr)
        {
            m.put(num,m.getOrDefault(num,0)+1);
        }
        for(int n:arr)
        {
            if(m.get(n)>max)
            {
                return n;
            }
        }
        return -1;
    }
}