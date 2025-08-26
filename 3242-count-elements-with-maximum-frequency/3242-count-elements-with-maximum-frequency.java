class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer>cnt=new HashMap<>();
        for(int num:nums)
        {
            cnt.put(num,cnt.getOrDefault(num,0)+1);
        }
        
        int maxf=0;
        for(int n:cnt.values())
        {
            maxf=Math.max(maxf,n);
        }
        int sum=0;
        for(int num:nums)
        {
            if(cnt.get(num)==maxf)
            {
                sum++;
            }
        }
      return sum;       
    }
}