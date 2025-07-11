class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)
        {
            return false;
        }
        int con=0;
        int v=0;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(!Character.isLetterOrDigit(c))
            {
                return false;
            }
            if (Character.isLetter(c)){
            if(isVowel(c))
            {
                v++;
            }
            else{
               con++;
            }
            }
        }
            return v >= 1 && con >= 1;
    
        }
        private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    
    }
}