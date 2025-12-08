class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int l=0;
        int cnt=0;
        int maxx=0;
        Set<Character>v=new HashSet<>(Arrays.asList('a','e','i','o','u'));
        for(int r=0;r<k;r++)
        {
          if(v.contains(s.charAt(r)))
          {
            cnt++;
          }
        }
        maxx=cnt;

        for(int i=k;i<n;i++)
        {
            if(v.contains(s.charAt(i)))cnt++;
            if(v.contains(s.charAt(i-k)))cnt--;
            maxx=Math.max(maxx,cnt);
        }
        return maxx;
    }
}