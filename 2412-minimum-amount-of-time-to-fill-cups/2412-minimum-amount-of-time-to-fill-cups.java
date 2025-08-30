class Solution {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        for(int i=0;i<amount.length/2;i++)
        {
            int temp=amount[i];
            amount[i]=amount[amount.length-1-i];
            amount[amount.length-1-i]=temp;
        }
        if(amount[0]>amount[1]+amount[2])
        {
            return amount[0];
        }
        int sum=0;
        for(int num:amount)
        {
           sum+=num;
        }
        return sum/2+sum%2;
    }
}