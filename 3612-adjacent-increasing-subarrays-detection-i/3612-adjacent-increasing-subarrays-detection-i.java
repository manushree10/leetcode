class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        int s1 = 1;       
        int s2 = 0;    

        for (int i = 1; i < n; i++) {
            if (nums.get(i) > nums.get(i-1)) {
                s1++;
            } else {
                
                s2 = s1;
                s1= 1;
            }

            
            if (s1 >= 2 * k) {
                return true;
            }
            if (Math.min(s2, s1) >= k) {
                return true;
            }
        }
        return false;
    }
}