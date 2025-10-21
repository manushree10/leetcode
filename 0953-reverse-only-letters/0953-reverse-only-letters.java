class Solution {
    public String reverseOnlyLetters(String s) {
        char[] c=s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r)
        {
            if(!Character.isLetter(c[l]))
            {
                l++;

            }
            else if(!Character.isLetter(c[r]))
            {
                r--;
            }
            else
            {
                char temp=c[l];
                c[l]=c[r];
                c[r]=temp;
                r--;
                l++;
            }

        }
        return new String(c);
    }
}