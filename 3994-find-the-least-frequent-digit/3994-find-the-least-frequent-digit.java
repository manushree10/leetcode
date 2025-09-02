class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] arr=Integer.toString(n).chars().map(c->c-'0').toArray();
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:arr)
        {
          map.put(num,map.getOrDefault(num,0)+1);
        }
        int res=0;
        int minn=Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int digit = entry.getKey();
            int freq = entry.getValue();

            if (freq < minn || (freq == minn && digit < res)) {
                minn = freq;
                res = digit;
            }
        }

        return res;
    }
}