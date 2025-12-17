class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] ar = new int[n];

        ar[0] = cost[0];
        ar[1] = cost[1];
        for (int i = 2; i < n; i++) {
            ar[i] = cost[i] + Math.min(ar[i - 1], ar[i - 2]);
        }

        
        return Math.min(ar[n - 1], ar[n - 2]);
    }
}