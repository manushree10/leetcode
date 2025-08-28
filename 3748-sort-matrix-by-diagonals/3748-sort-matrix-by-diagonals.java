import java.util.*;

class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        Map<Integer, List<Integer>> map = new HashMap<>();

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int key = i - j;
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(grid[i][j]);
            }
        }

        
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> v = entry.getValue();
            if (entry.getKey() >= 0) {
                v.sort(Collections.reverseOrder()); 
            } else {
                Collections.sort(v); 
            }
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int key = i - j;
                List<Integer> l = map.get(key);
                grid[i][j] = l.remove(0); 
            }
        }

        return grid;
    }

    
}
