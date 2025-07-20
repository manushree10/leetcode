class Solution {
    public int maxDifference(String s) {
   Map<Character,Integer>st=new HashMap<>();
   for(char c:s.toCharArray())
   {
    st.put(c,st.getOrDefault(c,0)+1);
   }
   int maxxodd=0;
   int mineven=s.length();
   for(int feq:st.values())
   {
    if(feq%2!=0)
    {
        maxxodd=Math.max(maxxodd,feq);
    }
    else 
    {
        mineven=Math.min(mineven,feq);
    }
   }
        return maxxodd-mineven;
    }
}