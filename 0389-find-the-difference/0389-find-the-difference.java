class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer>cnt=new HashMap<>();
        for(char c:t.toCharArray())
        {
            cnt.put(c,cnt.getOrDefault(c,0)+1);
        }

        for(char s1:s.toCharArray())
        {
            cnt.put(s1,cnt.get(s1)-1);
            if (cnt.get(s1) == 0) {
                cnt.remove(s1);
            }
        }
        for (char c1 : cnt.keySet()) {
            return c1; 
        }
        return ' ';
    }
}