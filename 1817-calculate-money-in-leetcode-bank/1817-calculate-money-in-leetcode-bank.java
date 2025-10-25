class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int curd = 1;
        int day = 1;

        for (int i = 1; i <= n; i++) {
            sum += curd;
            curd++;
            day++;

            
            if (day > 7) {
                day = 1; 
                curd = (i / 7) + 1; 
            }
        }
        return sum;
    }
}