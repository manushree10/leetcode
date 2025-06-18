class Solution {
    public int lengthOfLastWord(String s) {
        String word[]=s.trim().split(" +");
        return word[word.length-1].length();
    }
}