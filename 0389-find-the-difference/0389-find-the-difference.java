class Solution {
    public char findTheDifference(String s, String t) {
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        char res=0;
        for(int i=0;i<s1.length;i++)
        {
             res^=s1[i];
        }
        for(int i=0;i<t1.length;i++)
        {
             res^=t1[i];
        }
        return res;
    }
}