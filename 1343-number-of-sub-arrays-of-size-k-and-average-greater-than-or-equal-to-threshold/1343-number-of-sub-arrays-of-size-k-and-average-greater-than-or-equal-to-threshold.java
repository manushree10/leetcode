class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int l=0;
        int cnt=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            while(i-l+1>=k)
            {
                if(sum/k>=threshold)
                {
                    cnt++;
                }
                sum-=arr[l];
                l++;
            }
        }
        return cnt;
    }
}

   