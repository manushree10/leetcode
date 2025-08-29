class Solution {
    public long flowerGame(int n, int m) {
        long oddX = (n + 1L) / 2;     
        long evenX = n / 2;           
        long oddY = (m + 1L) / 2;     
        long evenY = m / 2;           

        
        return oddX * evenY + evenX * oddY;
    }
}