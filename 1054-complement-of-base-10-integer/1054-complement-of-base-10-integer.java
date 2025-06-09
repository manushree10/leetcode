class Solution {
    public int bitwiseComplement(int n) {
        int res=0;
        int temp=n;
        if(n==0)
         {
            return 1;
         }
         while(temp>0)
         {
            res=(res<<1)|1;
            temp = temp >> 1;
         }
         return n^res;
    }
}