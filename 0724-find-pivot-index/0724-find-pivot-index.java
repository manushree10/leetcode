class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
        int suml=0;
        int sumr=0;
        int[] l=Arrays.copyOfRange(nums,0,i);
        int[] r=Arrays.copyOfRange(nums,i+1,n);
        for(int a:l)
        {
            suml+=a;
        }
        for(int b:r)
        {
            sumr+=b;
        }
        if(suml==sumr)
        {
            return i;
        }
        }
        return -1;
    }
}