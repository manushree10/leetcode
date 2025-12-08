class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String res="";
        int max=0;
        for(String word:dictionary)
        {
            StringBuilder sb=new StringBuilder();
            int i=0;
            int j=0;
            int n=word.length();
            int len=s.length();
            while(i<n && j<len)
            {
                if(s.charAt(j)==word.charAt(i))
                {
                    sb.append(s.charAt(j));
                    i++;
                    j++;
                }
                else
                {
                    j++;
                }
            }
            if(sb.toString().equals(word))
            {
                if(n>max)
                {
                    max=n;
                    res=word;
                }
                else if(n==max)
                {
                    if(res.compareTo(word)>0)
                    {
                        res=word;
                    }
                }
            }
        }
        return res;
    }
}