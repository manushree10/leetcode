class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)
        {
           return false;
        }
        int mid=0;
      int   n=arr.length;
        for(int i=1;i<n-1;i++)
        {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {
                mid=i;
                break;
            }
        }
        if(mid==0 || mid==n-1)
        {
            return false;
        }
        for(int i=0;i<mid;i++)
        {
            if(arr[i]>=arr[i+1])
            {
                return false;
            }
        }
        for(int i=mid;i<n-1;i++)
        {
            if(arr[i]<=arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
}