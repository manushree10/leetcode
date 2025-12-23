class Solution {
    public int countGoodSubstrings(String s) {
      int i=0,j=0;
      int k=3;
      String  sum="";
      int n=s.length();
      int cnt=0;
      while(j<n)
      {
       
        if(j-i+1==k)
        {
            int a=s.charAt(i);
            int b=s.charAt(i+1);
            int c=s.charAt(j);
            if(a!=b && b!=c && c!=a ){
            cnt++;
            }
            i++;
        }
        j++;
      }
     return cnt;
    }
}



























//         int count =0;
//         for(int i=0 ; i<= s.length()-3 ; i++){
//           char a = s.charAt(i);
//           char b = s.charAt(i+1);
//           char c = s.charAt(i+2);

//           if(a!=b && b!=c && c!=a){
//             count++;
//           }
//         }
//         return count;
//     }
// }