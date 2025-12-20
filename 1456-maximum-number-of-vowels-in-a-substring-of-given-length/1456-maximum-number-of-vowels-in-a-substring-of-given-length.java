class Solution {
    public int maxVowels(String s, int k) {
        
        int l=0;
        int cnt=0;
        int maxx=0;
        for(int r=0;r<k;r++)
        {
            if(v(s.charAt(r)))
            {
                cnt++;
            }
        }
        maxx=cnt;
        int n=s.length();
        for(int i=k;i<n;i++)
        {
            if(v(s.charAt(i)))cnt++;
            if(v(s.charAt(i-k)))cnt--;
            maxx=Math.max(maxx,cnt);
        }
        return maxx;
    }
    private boolean v(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}