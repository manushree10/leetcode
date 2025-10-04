class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).sorted().toArray();
        int n=arr.length;
        
        if(n%2!=0)
        {
            return (double)arr[n/2];
        }
        else
        {
            int m1 = arr[n / 2 - 1];
            int m2 = arr[n / 2];
            return (double) (m1 + m2) / 2.0;
        }
    }
}