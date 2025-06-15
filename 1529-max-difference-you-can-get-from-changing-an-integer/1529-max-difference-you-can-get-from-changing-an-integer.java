class Solution {
    public int maxDiff(int num) {
       String s=Integer.toString(num);
       char max=' ';
       for(char c:s.toCharArray())
       {
        if(c!='9')
        {
           max=c;
           break;
        }
       }
       String maxstr=s.replace(max,'9');

       char min=' ';
       char replacewith=' ';
        if(s.charAt(0)!='1')
        {
          min=s.charAt(0);
          replacewith='1';
        }
        else
        {
            for(int i=1;i<s.length();i++)
            {
                if(s.charAt(i)!='0'&& s.charAt(i)!='1')
                {
                    min=s.charAt(i);
                    replacewith='0';
                    break;
                }
            }
        }
       String minstr=s.replace(min,replacewith);

       return Integer.parseInt(maxstr)-Integer.parseInt(minstr);
    }
}