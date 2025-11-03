class Solution {
    public long maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        long ll = (long)nums[n - 1] * (long)nums[n - 2] * 100000L;
        ll = Math.max(ll, (long)nums[0] * -100000L * (long)nums[n - 1]);
        ll = Math.max(ll, (long)nums[0] * (long)nums[1] * 100000L);
        return ll;
    }
}