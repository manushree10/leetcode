class Solution {
    public int nextBeautifulNumber(int n) {
        int num = n + 1;
        while (true) {
            if (isBalanced(num)) {
                return num;
            }
            num++;
        }
    }
private boolean isBalanced(int num)
{
    String s=String.valueOf(num);
    int[] freq=new int[10];
    for(char c:s.toCharArray())
    {
        freq[c-'0']++;
    }
    for(char c:s.toCharArray())
    {
        int digit=c-'0';
        if(freq[digit]!=digit)
        {
            return false;
        }
        
    }
    return true;
}
}
    
//     private boolean isBalanced(int num) {
//         int[] freq = new int[10]; 

        
//         int temp = num;
//         while (temp > 0) {
//             freq[temp % 10]++;
//             temp /= 10;
//         }

        
//         for (int i = 0; i < 10; i++) {
//             if (freq[i] != 0 && freq[i] != i) {
//                 return false;
//             }
//         }

//         return true;
//     }
// }
