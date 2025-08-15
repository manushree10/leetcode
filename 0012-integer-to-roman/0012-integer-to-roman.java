class Solution {
    public String intToRoman(int num) {
        // final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        // final String[] symbols = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        // StringBuilder sb = new StringBuilder();

        // for (int i = 0; i < values.length; ++i) {
        //     if (num == 0)
        //         break;
        //     while (num >= values[i]) {
        //         sb.append(symbols[i]);
        //         num -= values[i];
        //     }
        // }

        // return sb.toString();    
        Map<Integer, String> roman = new LinkedHashMap<>();
        roman.put(1000, "M");
        roman.put(900, "CM");
        roman.put(500, "D");
        roman.put(400, "CD");
        roman.put(100, "C");
        roman.put(90, "XC");
        roman.put(50, "L");
        roman.put(40, "XL");
        roman.put(10, "X");
        roman.put(9, "IX");
        roman.put(5, "V");
        roman.put(4, "IV");
        roman.put(1, "I");

        StringBuilder result = new StringBuilder();

        
        for (Map.Entry<Integer, String> entry : roman.entrySet()) {
            while (num >= entry.getKey()) {
                result.append(entry.getValue());
                num -= entry.getKey();
            }
        }
        return result.toString();
    }
}