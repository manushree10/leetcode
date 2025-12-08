class Solution {
    public int[] sortByReflection(int[] nums) {
        int n = nums.length;
        Integer[] ans = new Integer[n];
        for(int i = 0; i < n; i++) ans[i] = nums[i];
        Arrays.sort(ans, (a, b) -> {
            int aa = fun(a);
            int bb = fun(b);
            if(aa != bb) return aa - bb;
            return a - b;
        });
        for(int i = 0; i < n; i++) nums[i] = ans[i];
        return nums;
    }
    int fun(int n) {
        String s = Integer.toBinaryString(n);
        String k = new StringBuilder(s).reverse().toString();
        return Integer.parseInt(k, 2);
    }
}