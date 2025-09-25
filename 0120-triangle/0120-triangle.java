class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        for (int row = n - 2; row >= 0; row--) {
            List<Integer> current = triangle.get(row);
            List<Integer> below = triangle.get(row + 1);
            for (int col = 0; col < current.size(); col++) {
                int down = below.get(col);
                int downRight = below.get(col + 1);
                int bestBelow = Math.min(down, downRight);
                
                current.set(col, current.get(col) + bestBelow);
            }
        }
        
        return triangle.get(0).get(0);
    }
}