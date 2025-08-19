class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt = 0, res = 0;
        for (int num : nums) {
            res = (num == 0) ? res + 1 : 0;
            cnt += res;
        }
        return cnt;
    }
}