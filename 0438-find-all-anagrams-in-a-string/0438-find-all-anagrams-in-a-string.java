class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int n = s.length(), k = p.length();

        if (n < k) return result;

        char[] pArr = p.toCharArray();
        Arrays.sort(pArr); 

        for (int i = 0; i <= n - k; i++) {
            String window = s.substring(i, i + k);
            char[] winArr = window.toCharArray();
            Arrays.sort(winArr); 

            if (Arrays.equals(pArr, winArr)) {
                result.add(i);
            }
        }

        return result;
    }
}