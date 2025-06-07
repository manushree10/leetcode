//import java.util.regex.Pattern;
class Solution {
    public boolean detectCapitalUse(String word) {
       // return Pattern.matches("([A-Z]+|[a-z]+|[A-Z][a-z]*)",word);
       int capscnt=0;
       int n=word.length();
       for(int i=0;i<n;i++)
       {
        if(Character.isUpperCase(word.charAt(i)))
        {
            capscnt++;
        }
       }
       if(capscnt==0)
       {
        return true;
       }
       else if(capscnt==n)
       {
        return true ;
       }
       else if(capscnt==1 && Character.isUpperCase(word.charAt(0)))
       {
        return true;
       }
       else
       {
        return false;
       }
    }
}