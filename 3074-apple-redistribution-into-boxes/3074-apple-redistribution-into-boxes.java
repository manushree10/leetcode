class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        
        for(int num:apple)
        {
            sum+=num;
        }
        Arrays.sort(capacity);
        int cnt=0;
        int cap=0;
        for(int j=capacity.length-1;j>=0;j--)
        {
            cap+=capacity[j];
            cnt++;
            if(cap>=sum)
            {
                return cnt;
            }
        }
        return cnt;
    }
}