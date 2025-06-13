class Solution {
    public boolean isUgly(int n) {
        if(n<=0)
        {
            return false;

        }
        while(n%2==0) n=n/=2;
         while(n%3==0) n=n/=3;
          while(n%5==0) n=n/=5;

          return(n==1);
        // int a=2;
        // int b=3;
        // int c=5;
        // if(n==1)
        // {
        //     return true;
        // }
        // if(n==a*b||n==a*a*a||n==a*c ||n==b*c)
        // {
        //     return true;
        // }
        // else
        // {
        //     return false;
        // }
    }
}