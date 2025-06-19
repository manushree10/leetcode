class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros = 0, n = arr.length;
        
        
        for (int num : arr) {
            if (num == 0) zeros++;
        }
        
        int i = n - 1, j = n + zeros - 1; 
        
        
        while (i >= 0) {
            if (j < n) {
                arr[j] = arr[i]; 
            }
            j--;
            
            if (arr[i] == 0) {
                if (j < n) {
                    arr[j] = 0;
                }
                j--;
            }
            i--;
    }
}
}