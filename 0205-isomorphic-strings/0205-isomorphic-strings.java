class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Integer>s1=new HashMap<>();
        Map<Character,Integer>t1=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            if(!s1.containsKey(s.charAt(i)))
            {
                s1.put(s.charAt(i),i);
            }
            if(!t1.containsKey(t.charAt(i)))
            {
                t1.put(t.charAt(i),i);
            }
            if(!s1.get(s.charAt(i)).equals(t1.get(t.charAt(i))))
            {
                return false;
            }
        }
        return true;
    }
}