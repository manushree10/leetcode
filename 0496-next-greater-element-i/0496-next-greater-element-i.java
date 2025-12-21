class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // int[] result=new int[nums1.length];
        // int n=nums1.length;
        // int m=nums2.length;
        // for(int i=0;i<n;i++)
        // {
        //     int indx=-1;
        //     for(int j=0;j<m;j++)
        //     {
        //        if (nums2[j] == nums1[i]) {
        //             indx = j;
        //             break;
        //         }
        //     }
        //       int nextGreat = -1;
        //     for (int j = indx + 1; j <m; j++) {
        //         if (nums2[j] > nums1[i]) {
        //             nextGreat = nums2[j];
        //             break;
        //         }
        //     }

        //     result[i] = nextGreat;
        // }
    
        //     return result;
        int n1=nums1.length;
        Map<Integer,Integer>map=new HashMap<>();
        Stack<Integer>st=new Stack<>();
        for(int num:nums2)
        {
            while(!st.isEmpty() && st.peek()<num)
            {
                map.put(st.pop(),num);
            }
            st.push(num);
        }
        int[] res=new int[n1];
        for(int i=0;i<n1;i++)
        {
            res[i]=map.getOrDefault(nums1[i],-1);
        }
        return res;
        }
        
    }
