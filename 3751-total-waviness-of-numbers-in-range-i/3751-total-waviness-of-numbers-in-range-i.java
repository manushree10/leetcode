class Solution {
    public int totalWaviness(int num1, int num2) {
       
        int cnt=0;
        for(int i=num1;i<=num2;i++)
        {
            String n=String.valueOf(i);
            for(int j=1;j<n.length()-1;j++)
            {
                int cur=Character.getNumericValue(n.charAt(j));
                int prev=Character.getNumericValue(n.charAt(j-1));
                int nxt=Character.getNumericValue(n.charAt(j+1));

                if(cur>prev && cur>nxt || cur<prev && cur<nxt)
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}