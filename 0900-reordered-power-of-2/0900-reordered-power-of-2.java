class Solution {
    public boolean reorderedPowerOf2(int n) {
        String target = countDigits(n);  

        for (int i = 0; i < 31; i++) {   
            int power = 1 << i;         
            if (target.equals(countDigits(power))) {
                return true;
            }
        }
        return false;
    }

    
    private String countDigits(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        Arrays.sort(arr);  
        return new String(arr);
    }
}