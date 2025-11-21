class Solution {
    public int countPalindromicSubsequence(String s) {

        
        Map<Character, Integer> right = new HashMap<>();
        for (char c : s.toCharArray()) {
            right.put(c, right.getOrDefault(c, 0) + 1);
        }

        Set<Character> left = new HashSet<>();
        Set<String> seen = new HashSet<>();

        for (char mid : s.toCharArray()) {
            
            right.put(mid, right.get(mid) - 1);

            
            for (char ch : left) {
                if (right.getOrDefault(ch, 0) > 0) {
                    seen.add(ch + "" + mid + "" + ch);
                }
            }

            
            left.add(mid);
        }

        return seen.size();
    }
}
        //  int n = s.length();
        // int result = 0;

        // for (char c = 'a'; c <= 'z'; c++) {

        //     int left = s.indexOf(c);
        //     int right = s.lastIndexOf(c);

        //     if (left == -1 || right == -1 || left == right)
        //         continue;

        //     boolean[] seen = new boolean[26];

        //     for (int i = left + 1; i < right; i++) {
        //         seen[s.charAt(i) - 'a'] = true;
        //     }

        //     for (boolean b : seen)
        //         if (b) result++;
        // }

        // return result;