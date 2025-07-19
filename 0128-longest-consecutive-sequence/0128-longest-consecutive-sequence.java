class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>s=new HashSet<>();
        for(int num:nums)
        {
            s.add(num);
        }
        int longest=0;
        for(int num:s)
        {
            if(!s.contains(num-1))
            {
                int len=1;
            
            while(s.contains(num+len))
            {
                len++;
            }
            longest=Math.max(longest,len);
            }
        }
        return longest;
    }
}