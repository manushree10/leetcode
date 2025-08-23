class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result=new int[nums1.length];
        int n=nums1.length;
        int m=nums2.length;
        for(int i=0;i<n;i++)
        {
            int indx=-1;
            for(int j=0;j<m;j++)
            {
               if (nums2[j] == nums1[i]) {
                    indx = j;
                    break;
                }
            }
              int nextGreat = -1;
            for (int j = indx + 1; j <m; j++) {
                if (nums2[j] > nums1[i]) {
                    nextGreat = nums2[j];
                    break;
                }
            }

            result[i] = nextGreat;
        }
    
            return result;
        }
        
    }
