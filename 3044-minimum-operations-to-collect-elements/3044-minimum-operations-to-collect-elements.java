class Solution {
    public int minOperations(List<Integer> nums, int k) {
        Set<Integer> seen = new HashSet<>();
        int n = nums.size();

        for (int i = n - 1; i >= 0; i--) {
            int x = nums.get(i);
            if (x <= k) {
                seen.add(x);
                if (seen.size() == k) {
                    return n - i;
                }
            }
        }

        throw new IllegalArgumentException();
    }
}