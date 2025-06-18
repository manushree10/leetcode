class Solution {
    public int[][] divideArray(int[] nums, int k) {
        // Arrays.sort(nums);
        // List<List<Integer>> res = new ArrayList<>();

        // for (int i = 0; i < nums.length; i=i+3) {
        //     if (nums[i + 2]-nums[i]>k) {
        //         return new int[0][];
        //     }
        //     res.add(Arrays.asList(nums[i], nums[i + 1], nums[i + 2]));
        // }
        // int[][] ans = new int[res.size()][3];
        // for (int i = 0; i < res.size(); i++) {
        //     for (int j = 0; j < 3; j++) {
        //         ans[i][j] = res.get(i).get(j);
        //     }
        // }

        // return ans;

        Arrays.sort(nums);  
        int n = nums.length;
        if (n % 3 != 0) return new int[0][];

        List<int[]> result = new ArrayList<>();

        
        for (int i = 0; i < n; i += 3) {
            int a = nums[i];
            int b = nums[i + 1];
            int c = nums[i + 2];

            
            if (c - a > k) {
                return new int[0][];
            }

            
            result.add(new int[]{a, b, c});
        }

        
        return result.toArray(new int[0][]);
    }
}