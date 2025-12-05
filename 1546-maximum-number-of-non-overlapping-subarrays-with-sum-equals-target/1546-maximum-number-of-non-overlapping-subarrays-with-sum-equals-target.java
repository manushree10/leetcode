class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
        int n=nums.length;
        Set<Integer>pr=new HashSet<>();
        pr.add(0);
        int prsum=0;
        int cnt=0;
        for(int num:nums)
        {
           prsum+=num;
           if(pr.contains(prsum-target))
           {
              cnt++;
              prsum=0;
              pr.clear();
              pr.add(0);
           }
           else
           {
            pr.add(prsum);
           }
        }
        return cnt;
    }
}