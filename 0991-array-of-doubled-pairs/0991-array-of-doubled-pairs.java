class Solution {
    public boolean canReorderDoubled(int[] arr) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int a:arr)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        Integer[] num=new Integer[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            num[i]=arr[i];
        }
        Arrays.sort(num,Comparator.comparingInt(Math::abs));

        for(int x:num)
        {
            if(map.get(x)==0)continue;
            if(map.getOrDefault((2*x),0)<=0)
            {
                return false;
            }
            map.put(x,map.get(x)-1);
            map.put(2*x,map.get(2*x)-1);
        }
        return true;
    }
}