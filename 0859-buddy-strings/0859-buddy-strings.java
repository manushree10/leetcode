class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) 
        {
        return false;
        }
        if (s.equals(goal)) {
            return s.chars().distinct().count() < s.length();
        }
        int f = -1, st = -1, cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                cnt++;
                if (f == -1) f = i;
                else if (st == -1) st= i;
                else return false; 
            }
        }
        return cnt == 2 && 
               s.charAt(f) == goal.charAt(st) && 
               s.charAt(st) == goal.charAt(f);
    }
}