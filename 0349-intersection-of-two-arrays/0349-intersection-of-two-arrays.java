class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>s=new HashSet<>();
        for(Integer n:nums1)
        {
             s.add(n);
        }
        Set<Integer>res=new HashSet<>();
        for(Integer num:nums2)
        {
            if(s.contains(num))
            {
                res.add(num);
                s.remove(num);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}