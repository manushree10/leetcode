class Solution {
    public String largestGoodInteger(String num) {
        // String[] n = {"999","888","777","666","555","444","333","222","111","000"};
        // for (String s : n) {
        //     if (num.contains(s)) {
        //         return s;
        //     }
        // }
        // return "";
        int i = 0;            // Pointer to iterate through the string
        String max = "";      // Keeps track of the largest 3-digit same number
        
        while (i < num.length()) {
            
            if (i + 1 < num.length() && num.charAt(i) == num.charAt(i + 1) &&
                i + 2 < num.length() && num.charAt(i) == num.charAt(i + 2)) {
                
                
                if (max.compareTo(num.substring(i, i + 3)) < 0) {
                    max = num.substring(i, i + 3); 
                }
            }
            i++; 
        }
        return max;

    }
}