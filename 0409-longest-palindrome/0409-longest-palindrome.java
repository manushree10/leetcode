class Solution {
    public int longestPalindrome(String s) {
        int oddcnt=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)%2==1)
            {
                oddcnt++;
            }
            else
            {
                oddcnt--;
            }
        }
       if(oddcnt>1)
       {
        return s.length()-oddcnt+1;
       }

       return s.length();
    }
}