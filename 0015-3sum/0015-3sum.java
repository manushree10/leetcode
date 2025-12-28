class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
         //Set<List<Integer>>res=new HashSet<>();
         
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         for(int k=j+1;k<n;k++)
        //         {
        //             if(nums[i] + nums[j] + nums[k] == 0 )
        //             {
        //                  List<Integer>res1= Arrays.asList(nums[i], nums[j], nums[k]);
        //                  Collections.sort(res1);
        //                  res.add(res1);
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(res);
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
      
        for (int i = 0; i < n-2; i++)
        {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int total = nums[i] + nums[left] + nums[right];
               if(total==0)
               {
                res.add(Arrays.asList(nums[i],nums[left],nums[right]));

                while(left<right && nums[left]==nums[left+1])left++;
                 while(left<right && nums[right]==nums[right-1])right--;
                 left++;
                 right--;
               }
               else if(total<0)
                {
                    left++;
                }
                else
                {
                    right--;
                }

               }
                
            
        }
        return res;
        }
}