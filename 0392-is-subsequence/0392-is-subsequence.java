class Solution {
    public boolean isSubsequence(String s, String t) {
        int sl=0;
        int tl=0;
        while(sl<s.length() && tl<t.length())
        {
            if(s.charAt(sl)==t.charAt(tl))
            {
                sl++;
                
            }
            tl++;
        }
        if(s.length()==sl)
        {
            return true;
        }
        return false;
    }
}