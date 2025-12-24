import java.util.HashMap;

class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int i=0,j=0;
        int[] f=new int[26];
        int maxx=0;
        int res=0;
        while(j<n)
        {
            f[s.charAt(j)-'A']++;
            maxx=Math.max(maxx,f[s.charAt(j)-'A']);
            while(j-i+1-maxx>k)
            {
                f[s.charAt(i)-'A']--;
                i++;
            }
            res=Math.max(res,j-i+1);
            j++;

        }
        return res;
    }
}
        // HashMap<Character, Integer> freqs = new HashMap<>();
        // int res = 0, i = 0, maxFreq = 0;

        // for (int j = 0; j < s.length(); j++) {
        //     char c = s.charAt(j);
        //     freqs.put(c, freqs.getOrDefault(c, 0) + 1);
        //     maxFreq = Math.max(maxFreq, freqs.get(c));

        //     while ((j - i + 1) - maxFreq > k) {
        //         char left = s.charAt(i);
        //         freqs.put(left, freqs.get(left) - 1);
        //         i++;
        //     }

        //     res = Math.max(res, j - i + 1);
        // }

        // return res;
        
//     }
// }