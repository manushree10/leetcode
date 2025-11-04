import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] res = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            
            Map<Integer, Integer> freq = new HashMap<>();

            
            for (int j = i; j < i + k; j++) {
                freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            }

            
            List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
            list.sort((a, b) -> {
                if (!b.getValue().equals(a.getValue())) {
                    return b.getValue() - a.getValue(); 
                }
                return b.getKey() - a.getKey(); 
            });

            
            int sum = 0;
            for (int t = 0; t < Math.min(x, list.size()); t++) {
                int num = list.get(t).getKey();
                int count = list.get(t).getValue();
                sum += num * count;
            }

            
            res[i] = sum;
        }

        return res;
    }
}
