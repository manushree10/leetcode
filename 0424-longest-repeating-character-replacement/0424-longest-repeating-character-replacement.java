class Solution {
    public int characterReplacement(String s, int k) {
        int i=0,j=0;
        int maxx=0;
        int n=s.length();
        int[] f= new int[26];
        int res=0;
        for( j=0;j<n;j++)
        {
            f[s.charAt(j)-'A']++;
            maxx=Math.max(maxx,f[s.charAt(j)-'A']);
            while(j-i+1-maxx>k)
            {
                f[s.charAt(i)-'A']--;
                i++;
            }
            res=Math.max(res,j-i+1);
        }
        return res;
    }
}