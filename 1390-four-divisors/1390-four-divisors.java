// class Solution {
//     public int sumFourDivisors(int[] nums) {
//         int n=nums.length;
//         int sum=0;
//         for(int x:nums)
//         {
//             int cnt=0;
//            int cur=0;
//         for(int i=1;i*i<x;i++)
//         {
           
//            if(x%i==0)
//            {
//             cnt++;
//             cur+=i;
           
//            if(i*i!=x){
           
//             cnt++;
//             cur+=x/i;
//            }
//            }
//             if(cnt>4)break;
//         }
//        if(cnt==4)
//        {
//         sum+=cur;
//        }
//         }
//         return sum;
//     }
// }


import java.util.*;

class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;
        
        for (int n : nums) {
            List<Integer> divs = getDivisors(n);
            if (divs.size() == 4) {
                for (int d : divs) {
                    totalSum += d;
                }
            }
        }
        
        return totalSum;
    }

    private List<Integer> getDivisors(int num) {
        List<Integer> div = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                div.add(i);
                if (i != (num / i)) {
                    div.add(num / i);
                }
            }
           
            if (div.size() > 4) break;
        }
        return div;
    }
}
