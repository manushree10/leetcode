class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n=answerKey.length();
        int i=0,j=0;
        int[] f=new int[26];
        int maxx=0;
        int res=0;
        for(j=0;j<n;j++)
        {
            f[answerKey.charAt(j)-'A']++;
            maxx=Math.max(maxx,f[answerKey.charAt(j)-'A']);
            while(j-i+1-maxx>k)
            {
                f[answerKey.charAt(i)-'A']--;
                i++;
            }
            res=Math.max(res,j-i+1);
        }
        return res;
    }
}