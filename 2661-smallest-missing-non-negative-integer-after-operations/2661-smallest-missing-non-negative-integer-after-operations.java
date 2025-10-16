class Solution {
    public int findSmallestInteger(int[] nums, int value) {
         Map<Integer, Integer> map = new HashMap<>();
        
        
        for (int num : nums) {
            int rem = ((num % value) + value) % value;
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        
        int x = 0;
        while (true) {
            int rem = x % value;
            if (!map.containsKey(rem) || map.get(rem) == 0)
                return x; 
            map.put(rem, map.get(rem) - 1); 
            x++;
        }
    }
}