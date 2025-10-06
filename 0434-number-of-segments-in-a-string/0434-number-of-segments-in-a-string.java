class Solution {
    public int countSegments(String s) {
     return    s.trim().isEmpty() ? 0 : s.trim().split("\\s+").length;
         
    }
}