class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n=arr.length;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            
            if(arr[i]%2!=0)
            {
                cnt++;
            
            if(cnt==3)
            {
                return true;
            }
            }
             else
             {
                cnt=0;
             }
        }
        
        return false;
    }
}