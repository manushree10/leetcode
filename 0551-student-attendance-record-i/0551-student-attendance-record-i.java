class Solution {
    public boolean checkRecord(String s) {
        
        int a=0;
        int l=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A')
            {
                a++;
            }
            else if(s.charAt(i)=='L') { 
                if (i > 1 && s.charAt(i - 1) == 'L' && s.charAt(i - 2) == 'L') { 
                    return false; 
                }
            }
            
        }
        if(a>=2)
        {
            return false;
        }
        return true;
    }
}