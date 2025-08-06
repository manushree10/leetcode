class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int f=fruits.length;
        int b=baskets.length;
        int cnt=0;
        for(int i=0;i<f;i++)
        {
            for(int j=0;j<b;j++)
            {
                if(baskets[j]>=fruits[i])

                {
                    baskets[j]=-1;
                    cnt++;
                    break;
                }
            }
        }
        return f-cnt;
    }
}