class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // int n=nums.length;
        // for(int i=0;i<n;i++)
        // {
        //     int sum=0;
        //     for(int j=i;j<n;j++)
        //     {
        //         sum+=nums[j];
        //         if(k==0)
        //         {
        //             sum=0;
        //             if(sum == 0 && (j - i + 1) >= 2)
        //             {
        //                 return true;
        //             }
        //         }
        //         else if (sum % k == 0 && (j - i + 1) >= 2)
        //         {
        //              return true;
        //         }
        //     }
        // }
        // return false;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); 

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum % k;

            
           // if (rem < 0) rem += k;

            if (map.containsKey(rem)) {
                
                if (i - map.get(rem) > 1) {
                    return true;
                }
            } else {
                
                map.put(rem, i);
            }
        }
        return false;
    }
}