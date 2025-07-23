class Solution {
    public int compress(char[] chars) {
        if(chars.length<1)
        {
            return 1;
        }
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<chars.length)
        {
            char curchar=chars[i];
            int cnt=0;
            while(i<chars.length && curchar==chars[i])
            {
                cnt++;
                i++;

            }
            sb.append(curchar);
            if(cnt>1)
            {
                sb.append(String.valueOf(cnt));
            }
        }
         for (int j = 0; j < sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }

        return sb.length();
       
    }
}