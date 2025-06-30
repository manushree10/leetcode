class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> p = new HashMap<>();
        
        // Step 1: Count frequencies of each number
        for (int num : nums) {
            p.put(num, p.getOrDefault(num, 0) + 1);
        }
        
        int max= 0;
        
        
        for (int num : p.keySet()) {
            if (p.containsKey(num + 1)) {
                int currentLength = p.get(num) + p.get(num + 1);
                max = Math.max(max, currentLength);
            }
        }
        return max;
    }
}