class Solution {
    public int countMonobit(int n) {
        int cnt=1;
        int cur=1;
        while(cur<=n)
        {
            cnt++;
            cur=(cur<<1)|1;
        }
        return cnt;
    }
}