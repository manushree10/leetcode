class Solution {
    public int majorityElement(int[] nums) {
//         int n=nums.length;
        
//         Arrays.sort(nums);
//         int maxx=nums[0];
//         int maxcnt=0;
        
//         for(int i=0;i<n;i++)
//         {
//             int cnt=1;
//             for(int j=i+1;j<n;j++)
//             {
                
//                 if(nums[i]==nums[j])
//                 {
//                     cnt++;
                    
//                 }
//             }
//             if(cnt>maxcnt)
//             {
//                 maxcnt=cnt;
//                 maxx=nums[i];
//             }
//         }
//         if(maxcnt>n/2)
//         {
//             return maxx;
//         }
//             return -1;
//     }
// }
        Map<Integer,Integer>map=new HashMap();
        int n=nums.length;
        for(int num:nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num)>n/2)
            {
                return num;
            }
        }
        return -1;

    }
}