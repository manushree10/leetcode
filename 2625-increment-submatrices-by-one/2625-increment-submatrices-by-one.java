class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] res = new int[n][n];
        for (int[] q : queries) {
            int r1 = q[0], c1 = q[1], r2 = q[2], c2 = q[3];
            r2++;
            c2++;
            res[r1][c1] += 1;
            if (c2 < n) 
                res[r1][c2] -= 1;
            if (r2 < n) {
                res[r2][c1] -= 1;
                if (c2 < n) 
                    res[r2][c2] += 1;
            }
        }
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            int acc = 0;
            for (int j = 0; j < n; j++) {
                dp[j] += res[i][j];
                acc += dp[j];
                res[i][j] = acc;
            }
        }
        return res;
    }
}