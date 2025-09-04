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
        for (int i = 0; i < nums.length; i++)
        {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];

                if (total > 0) {
                    k--;
                } else if (total < 0) {
                    j++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while (nums[j] == nums[j-1] && j < k) {
                        j++;
                    }
        }
            }
        }
        return res;
        }
}