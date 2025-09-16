class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums)
        {
            set.add(n);
        }
        List<Integer>res=new ArrayList<>(set);
        Collections.sort(res,Collections.reverseOrder());
        if(res.size()>k)
        {
            res=res.subList(0,k);
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}