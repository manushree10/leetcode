import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        
        Arrays.sort(arr, (a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            if (freqA != freqB) {
                return freqA - freqB; 
            } else {
                return b - a; 
            }
        });

        
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
}
