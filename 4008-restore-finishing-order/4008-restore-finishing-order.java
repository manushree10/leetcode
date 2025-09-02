class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int o=order.length;
        int f=friends.length;
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<o;i++)
        {
            for(int j=0;j<f;j++)
            {
                if(order[i]==friends[j])
                {
                    res.add(order[i]);
                    break;
                }

            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}