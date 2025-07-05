class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] result = new int[n + 1];
        int low = 0, high = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                result[i] = low;
                low++;
            } else {
                result[i] = high;
                high--;
            }
        }

        
        result[n] = low;  // or high

        return result;
    }
}
