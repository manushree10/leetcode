class Solution {
    public int secondHighest(String s) {
        Set<Integer>set=new HashSet<>();
        
        for(char n:s.toCharArray())
        {
            if(Character.isDigit(n))
            {
                set.add(n-'0');
            }
        }
        if(set.size()<2)
        {
            return -1;
        }
        int lar=-1;
        int sec=-1;
        for(int d:set)
        {
            if(d>lar)
            {
                sec=lar;
                lar=d;
                
            }
            else if(d>sec)
            {
                sec=d;
            }
        }
        return sec;
    }
}