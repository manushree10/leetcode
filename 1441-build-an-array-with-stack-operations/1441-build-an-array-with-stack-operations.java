class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String>res=new ArrayList<>();
        int curidx=0;
        for(int i=1;i<=n && curidx<target.length;i++)
        {
            res.add("Push");
           if(i!=target[curidx])
           {
             res.add("Pop");
           }
           else
           {
            curidx++;
           }
          
        }
        return res;
    }
}