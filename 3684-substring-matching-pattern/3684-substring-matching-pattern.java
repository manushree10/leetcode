class Solution {
    public boolean hasMatch(String s, String p) {
        
        
        int starIndex = p.indexOf('*');
        String prefix = p.substring(0, starIndex);
        String suffix = p.substring(starIndex + 1);

        int minLen = prefix.length() + suffix.length();

        
        for (int i = 0; i <= s.length() - minLen; i++) {
            for (int j = i + minLen; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (sub.startsWith(prefix) && sub.endsWith(suffix)) {
                    return true;
                }
            }
        }

        return false;
    }
}

   