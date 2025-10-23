class Solution {
    public boolean hasSameDigits(String s) {
        int n=s.length();
        int[] t=new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = s.charAt(i) - '0';
        }
        for(int j=n;j>2;j--)
        {
            for(int i=0;i<j-1;i++)
            {
                t[i]=(t[i]+t[i+1])%10;
            }
        }
        return t[0]==t[1];
    }
}

// while(s.length()>2){
//             StringBuilder ans=new StringBuilder();
//             for(int i=0;i<s.length()-1;i++){
//                 ans.append(((s.charAt(i)-'0')+(s.charAt(i+1)-'0'))%10);
//             }
//             s=ans.toString();
//         }
//         return s.charAt(0)==s.charAt(1);