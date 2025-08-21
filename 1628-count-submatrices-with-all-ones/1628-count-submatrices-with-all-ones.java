class Solution {
    public int numSubmat(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        
        
        int[] heights = new int[cols];
        int total = 0;
        
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1) {
                    heights[j] += 1; // stack more 1s
                } else {
                    heights[j] = 0; // reset
                }
            }
            
            
            for (int j = 0; j < cols; j++) {
                int minHeight = heights[j];
                for (int k = j; k >= 0 && minHeight > 0; k--) {
                    minHeight = Math.min(minHeight, heights[k]);
                    total += minHeight;
                }
            }
        }
        
        return total;
    }
}
