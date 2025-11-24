class Solution {
    public long sumAndMultiply(int n) {
         if (n == 0) {
            return 0;
        }
        String s=String.valueOf(n);
        StringBuilder sb= new StringBuilder();
        int sum=0;
        long sum1=0;
        for(char c:s.toCharArray())
        {
            int n1=c-'0';
            if(n1!=0)
            {
              sb.append(n1);
              sum+=n1;
            }
        }
        sum1 = (long) Integer.parseInt(sb.toString()) * sum;
      
      return sum1;

    }
}