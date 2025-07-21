class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        
        for(char c:s.toCharArray())
        {
            int len=sb.length();
            if(len>=2 && sb.charAt(len-1)==c && sb.charAt(len-2)==c)
            {
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}