class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>ans=new ArrayList<>();
        ans.add(1);
        for(int i=0;i<rowIndex;i++)
        {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 1; j < ans.size(); j++) { 
                newRow.add(ans.get(j - 1) + ans.get(j));
             }
            newRow.add(1);
            ans = newRow;
        }
        return ans;
    }
}