class Solution {
    public int removeDuplicates(int[] nums) {
        //  int k = 2;

        // for (int i = 2; i < nums.length; i++) {
        //     if (nums[i] != nums[k - 2]) {
        //         nums[k] = nums[i];
        //         k++;
        //     }
        // }

        // return k; 

        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();
        
        
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        
        for (int num : nums) {
            if (freq.get(num) > 0) {
                int count = Math.min(freq.get(num), 2);
                for (int i = 0; i < count; i++) {
                    resultList.add(num);
                }
                freq.put(num, 0); 
            }
        }
      for (int i = 0; i < resultList.size(); i++) {
            nums[i] = resultList.get(i);
        }
        
        return resultList.size(); 
          
    }
}