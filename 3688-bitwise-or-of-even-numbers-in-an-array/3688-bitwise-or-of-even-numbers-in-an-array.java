class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int res=0;
        for(int num:nums)
        {
            if((num&1)==0)
            {
                res|=num;
            }
        }
        return res;
    }
}