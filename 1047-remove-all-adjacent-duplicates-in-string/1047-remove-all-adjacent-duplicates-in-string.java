class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(!st.isEmpty() && st.peek()==c)
            {
                st.pop();
            }
            else{
            
            st.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char s1:st)
        {
            sb.append(s1);
        }
        return sb.toString();
    }
}