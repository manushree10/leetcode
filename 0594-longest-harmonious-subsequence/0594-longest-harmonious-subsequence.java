class Solution {
    public int findLHS(int[] nums) {

        Arrays.sort(nums);
        int j = 0;
        int maxLength = 0;
        
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] - nums[j] > 1) {
                j++;
            }
            if (nums[i] - nums[j] == 1) {
                maxLength = Math.max(maxLength, i - j + 1);
            }
        }
        return maxLength;
    }
}
//         Map<Integer, Integer> p = new HashMap<>();
        
        
//         for (int num : nums) {
//             p.put(num, p.getOrDefault(num, 0) + 1);
//         }
        
//         int max= 0;
        
        
//         for (int num : p.keySet()) {
//             if (p.containsKey(num + 1)) {
//                 int currentLength = p.get(num) + p.get(num + 1);
//                 max = Math.max(max, currentLength);
//             }
//         }
//         return max;
//     }
// }