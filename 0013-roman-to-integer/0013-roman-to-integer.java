class Solution {
    public int romanToInt(String s) {
       Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        

        int sum = 0;
        int n = s.length();

        
        for (int i = 0; i < n; i++) {
            int value = romanMap.get(s.charAt(i));

           
            if (i < n - 1 && value < romanMap.get(s.charAt(i + 1))) {
                sum -= value;
            } else {
                sum += value;
            }
        }

        return sum;
    }
}