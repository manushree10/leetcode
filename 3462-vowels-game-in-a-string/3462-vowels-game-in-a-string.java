class Solution {
    public boolean doesAliceWin(String s) {
       for(char ch:s.toCharArray()) {
            if("aeiou".indexOf(ch)!=-1) {
                return true;
            }
        }
        return false;
    }
}