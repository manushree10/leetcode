class Solution {
    public int[] findErrorNums(int[] nums) {
        // int dup=-1;
        // int miss=-1;
        // int n=nums.length;
        // for(int i=1;i<=n;i++)
        // {
        //    int  cnt=0;
        //     for(int j=0;j<n;j++)
        //     {
        //        if(nums[j]==i){
        //        cnt++;
        //        }
        //     }
        //     if(cnt>=2)
        //     {
        //         dup=i;
        //     }
        //     else if(cnt==0)
        //     {
        //         miss=i;
        //     }
        // }
        // return new int[] {dup,miss};
        int n=nums.length;
        int actual_sum = n * (n + 1) / 2;
        int array_sum = 0;
        int unique_sum = 0;
        Set<Integer> s = new HashSet<>();

        for (int a : nums) {
            array_sum += a;
        }

        for (int a : nums) {
            s.add(a);
        }

        for (int a : s) {
            unique_sum += a;
        }

        int missing = actual_sum - unique_sum;
        int duplicate = array_sum - unique_sum;

        return new int[]{duplicate, missing};
    }
}