class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String s:operations)
        {
            if("X++".equals(s)||"++X".equals(s))
            {
                x++;
            }
            else
            {
                x--;
            }
        }
        return x;
    }
}