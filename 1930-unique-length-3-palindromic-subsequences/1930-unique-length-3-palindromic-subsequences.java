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
