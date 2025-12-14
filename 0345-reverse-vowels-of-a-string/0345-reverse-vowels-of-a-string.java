class Solution {
    public String reverseVowels(String s) {
        String res="";
        char[] word = s.toCharArray();
        int l=0;
        int r=s.length()-1;
        String v="aeiouAEIUO";
        while(l<r)
        {
            while(l<r && v.indexOf(s.charAt(l))==-1)
            {
                l++;
            }
            while(l<r && v.indexOf(s.charAt(r))==-1)
            {
                r--;
            }
            char temp=word[l];
            word[l]=word[r];
            word[r]=temp;

            l++;
            r--;
        }
        res=new String(word);
        return res;
    }
}