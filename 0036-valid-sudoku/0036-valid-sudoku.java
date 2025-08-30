class Solution {
    public boolean isValidSudoku(char[][] board) {
       
        HashSet<String> seen = new HashSet<>();

        
        for (int i = 0; i < 9; i++) {          
            for (int j = 0; j < 9; j++) {      
                char num = board[i][j];

                
                if (num != '.') {
                    
                    String rowTag = num + " in row " + i;
                    String colTag = num + " in column " + j;
                    String boxTag = num + " in box " + (i/3) + "-" + (j/3);

                   
                    if (seen.contains(rowTag) || seen.contains(colTag) || seen.contains(boxTag)) {
                        return false;
                    }

                    
                    seen.add(rowTag);
                    seen.add(colTag);
                    seen.add(boxTag);
                }
            }
        }

        
        return true;
    }
}
