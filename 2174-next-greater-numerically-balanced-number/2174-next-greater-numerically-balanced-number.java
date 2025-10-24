class Solution {
    public int nextBeautifulNumber(int n) {
        int num = n + 1;
        while (true) {
            if (isBalanced(num)) {
                return num;
            }
            num++;
        }
    }

    
    private boolean isBalanced(int num) {
        int[] freq = new int[10]; 

        
        int temp = num;
        while (temp > 0) {
            freq[temp % 10]++;
            temp /= 10;
        }

        
        for (int i = 0; i < 10; i++) {
            if (freq[i] != 0 && freq[i] != i) {
                return false;
            }
        }

        return true;
    }
}
