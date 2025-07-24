class Solution {
    public int longestSubstring(String s, int k) {
        if (s.length() == 0) return 0;
        int maxl=0;
        Map<Character,Integer>freqL=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            
            freqL.put(ch,freqL.getOrDefault(ch,0)+1);
            
        }
            for(int i=0;i<s.length();i++)
            {
                if (freqL.get(s.charAt(i)) < k){
                int l = longestSubstring(s.substring(0, i), k);
                int r = longestSubstring(s.substring(i + 1), k);
                return Math.max(l, r);
                }
          }
          return s.length();
}
}