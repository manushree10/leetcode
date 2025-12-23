class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>res=new ArrayList<>();
        if(s.length()<p.length())
        {
            return res;

        }
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(char c:p.toCharArray())
        {
            freq1[c-'a']++;
        }
        int i=0,j=0;
        int k=p.length();
        while(j<s.length())
        {
           freq2[s.charAt(j)-'a']++;

           if(j-i+1>k)
           {
            freq2[s.charAt(i)-'a']--;
            i++;
           }
           if(j-i+1==k && Arrays.equals(freq1,freq2))
           {
              res.add(i);
           }
           j++;
        }
        return res;
    }
}