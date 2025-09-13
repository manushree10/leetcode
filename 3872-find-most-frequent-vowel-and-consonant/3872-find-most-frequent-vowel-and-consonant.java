class Solution {
    public int maxFreqSum(String s) {
        int cntv=0;
        int cntc=0;
        Map<Character,Integer>freq=new HashMap<>();
        for(char c:s.toCharArray())
        {
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> map:freq.entrySet())
        {
            char ch=map.getKey();
            int n=map.getValue();
            if(isVowel(ch))
            {
                cntv=Math.max(cntv,n);
            }
            else
            {
                cntc=Math.max(cntc,n);
            }
        }
        return cntv+cntc;
    }
    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1; // check if vowel
    }
}