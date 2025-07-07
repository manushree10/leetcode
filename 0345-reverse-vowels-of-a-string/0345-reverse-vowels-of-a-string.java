class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int beg=0;
        int end=s.length()-1;
        String vowls="aeiouAEIOU";

        while(beg<end)
        {
            while(beg<end && vowls.indexOf(word[beg])==-1)
            {
                beg++;
            }
             while(beg<end && vowls.indexOf(word[end])==-1)
            {
                end--;
            }
            char temp = word[beg];
            word[beg] = word[end];
            word[end] = temp;

            beg++;
            end--;
        }
        String res=new String(word);
        return res;
    }
}