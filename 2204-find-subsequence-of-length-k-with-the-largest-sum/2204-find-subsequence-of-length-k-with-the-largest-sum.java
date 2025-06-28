import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i]; 
            arr[i][1] = i;       
        }

        
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

       
        Arrays.sort(arr, 0, k, Comparator.comparingInt(a -> a[1]));

        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[i][0];
        }

        return result;
    }
}
