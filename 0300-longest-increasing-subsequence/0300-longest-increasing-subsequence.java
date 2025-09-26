class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer>res=new ArrayList<>();
        for(int n:nums)
        {
            if(res.isEmpty() || res.get(res.size()-1)<n)
            {
                res.add(n);

            }
            else
            {
                int idx=binarys(res,n);
                res.set(idx,n);
            }
        }
        return res.size();
    }
    private int binarys(List<Integer>arr,int target)
    {
        int n=arr.size();
        int l=0;
        int r=n-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr.get(mid)==target)
            {
                return mid;
            }else if(arr.get(mid)>target)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return l;
    }
}