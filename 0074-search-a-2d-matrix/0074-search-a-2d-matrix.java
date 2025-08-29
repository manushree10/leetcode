class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // int m=matrix.length;
        // int n=matrix[0].length;
        // for(int i=0;i<m;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(matrix[i][j]==target)
        //         {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        List<Integer> list=new ArrayList<>();
      for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
          list.add(matrix[i][j]);
        }
      }  
      int low=0;
      int high=list.size()-1;
      while(low<=high){
        int mid=low+(high-low)/2;
        if(target==list.get(mid)){
            return true;
        }
        else if(target<list.get(mid)){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
      }
      return false;
    }
}