class Solution {
    public int distributeCandies(int[] candyType) {
        int cnt=0;
        int n=candyType.length;
        Set<Integer>set=new HashSet<>();
          for(int i=0;i<n;i++)
          {
            set.add(candyType[i]);
          }

        cnt=n/2;
        if(set.size()<cnt)
        {
            return set.size();
        }

        return cnt;
    }
}