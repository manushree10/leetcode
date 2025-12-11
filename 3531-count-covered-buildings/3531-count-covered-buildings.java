
class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        int[] l = new int[n + 1];
        int[] r = new int[n + 1];
        int[] t = new int[n + 1];
        int[] b = new int[n + 1];

        Arrays.fill(l, n + 1);
        Arrays.fill(r, 0);
        Arrays.fill(t, 0);
        Arrays.fill(b, n + 1);

        for (int[] building : buildings) {
            int i = building[0];
            int j = building[1];

            l[j] = Math.min(l[j], i);
            r[j] = Math.max(r[j], i);

            t[i] = Math.max(t[i], j);
            b[i] = Math.min(b[i], j);
        }

        int cnt = 0;
        for (int[] building : buildings) {
            int i = building[0];
            int j = building[1];

            if (i > l[j] && i < r[j] && j > b[i] && j < t[i]) {
                cnt++;
            }
        }

        return cnt;
    }
}