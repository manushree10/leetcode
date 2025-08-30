class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String con = s + s;
        String s1= con.substring(1, con.length() - 1);
        return s1.contains(s);
    }
}