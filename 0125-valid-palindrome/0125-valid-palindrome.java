class Solution {
    public boolean isPalindrome(String s) {
      String st=s.toLowerCase();
      String S=st.replaceAll("[^a-zA-Z0-9]","");
      String res="";
      for(char c:S.toCharArray())
      {
          res=c+res;
      }
        return S.equals(res);
      
    }
}