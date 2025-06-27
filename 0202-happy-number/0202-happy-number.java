class Solution {
    public boolean isHappy(int n) {
    //     int s=getnum(n);
    //     int f=getnum(getnum(n));
    //     while(s!=f){
    //     if(f==1)
    //     {
    //         return true;
    //     }
    //      s=getnum(s);
    //      f=getnum(getnum(f));
    //     }
    //     return s==1;
    // }
    // private int getnum(int n)
    // {
    //     int res=0;
    //     while(n>0)
    //     {
    //         int digit=n%10;
    //         res+=digit*digit;
    //         n=n/10;
    //     }
    //     return res;

    HashSet<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) {
                return false; 
            }
            seen.add(n);
            n = getSum(n);
        }

        return true;
    }

    private int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}