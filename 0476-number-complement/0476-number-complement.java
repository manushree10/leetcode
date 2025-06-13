class Solution {
    public int findComplement(int num) {
        if(num==1)
        {
            return 0;
        }
        int m=0;
        int temp=num;
        while(temp>0){
        m=(m<<1)|1;
        temp=(temp>>1);
        }
        return num^m;
    }
}