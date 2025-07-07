class Solution {
    public int scoreOfString(String s) {
        int n=0;
        for(int i=0;i<s.length()-1;i++)
        {
           n=n+Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return n;
    }
}