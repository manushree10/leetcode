class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String con = s + s;
        return con.substring(1, con.length() - 1).contains(s);
    }
}