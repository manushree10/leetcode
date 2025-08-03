class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int l=0;
        int r=0;
        while(l<n1 && r<n2)
        {
            if(nums1[l]<nums2[r])
            {
                l++;
            }
            else if(nums1[l]>nums2[r])
            {
                r++;
            }
            else{
            return nums1[l];
            }
        }
        return -1;
    }
}