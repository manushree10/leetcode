class Solution {
    public String longestPalindrome(String s) {
       String l= "";
        int n=s.length();
        for(int i=0;i<n;i++)
        {
           for(int j=i;j<n;j++)
           {
            String sub=s.substring(i,j+1);
            if (isPalindrome(sub) && sub.length() > l.length()) {
                    l = sub;
                }
           }
        }
        return l;
    }
    private boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}