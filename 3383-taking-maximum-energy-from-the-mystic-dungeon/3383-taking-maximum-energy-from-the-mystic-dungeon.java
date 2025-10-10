class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int len = energy.length;
        int[] dp = new int[len];
        int res = Integer.MIN_VALUE;
        for (int i = len - 1; i >= 0; i--) {
            dp[i] = energy[i] + (i + k < len ? dp[i + k] : 0);
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}