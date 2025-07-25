class Solution {
    public int maxSum(int[] nums) {
        int mx = Arrays.stream(nums).max().getAsInt();
        if (mx <= 0) {
            return mx;
        }
        Set<Integer> seen = new HashSet<>();
        int total = 0;
        for (int num : nums) {
            if (num > 0 && seen.add(num)) {
                total += num;
            }
        }
        return total;
    }
}