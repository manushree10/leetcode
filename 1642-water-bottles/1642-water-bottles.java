class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res=numBottles;
        while(numBottles>=numExchange)
        {
            int temp=numBottles/numExchange;
            int rem=numBottles%numExchange;
            res+=temp;
            numBottles=temp+rem;
        }
        return res;
    }
}