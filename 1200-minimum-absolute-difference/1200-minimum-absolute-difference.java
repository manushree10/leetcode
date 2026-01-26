class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        List<List<Integer>>res=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            int diff=arr[i]-arr[i-1];
            if(diff<min)
            {
                min=diff;
                res=new ArrayList<>();
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }
            else if(diff==min)
            {
                 res.add(Arrays.asList(arr[i-1],arr[i]));
            }
               
        }
        return res;
    }
}