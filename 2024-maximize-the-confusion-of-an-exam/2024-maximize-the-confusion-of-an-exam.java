class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n=answerKey.length();
        int i=0,j=0;
        int res=0;
        int max=0;
        int[] f=new int[26];
        while(j<n)
        {
            f[answerKey.charAt(j)-'A']++;
           max=Math.max(max,f[answerKey.charAt(j)-'A']);
            if(j-i+1-max>k)
            {
                 f[answerKey.charAt(i)-'A']--;
                i++;
            }
            res=Math.max(res,j-i+1);
            j++;
        }
        return res;
    }
}