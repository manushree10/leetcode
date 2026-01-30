class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0)
        {
             return "";
        }
        for(int i=0;i<strs[0].length();i++)
        {
            char s=strs[0].charAt(i);

            for(int j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length() || strs[j].charAt(i)!=s)
                return strs[0].substring(0, i);
            }
        }

        return strs[0];
    }
}


// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         Arrays.sort(strs);
//         String s1 = strs[0];
//         String s2 = strs[strs.length-1];
//         int idx = 0;
//         while(idx < s1.length() && idx < s2.length()){
//             if(s1.charAt(idx) == s2.charAt(idx)){
//                 idx++;
//             } else {
//                 break;
//             }
//         }
//         return s1.substring(0, idx);
//     }
// }