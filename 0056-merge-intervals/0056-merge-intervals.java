class Solution {
    public int[][] merge(int[][] intervals) {

        
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();

        
        merged.add(intervals[0]);

        
        for (int i = 1; i < intervals.length; i++) {

            int[] last = merged.get(merged.size() - 1);   
            int[] curr = intervals[i];                   

            if (curr[0] <= last[1]) { 
                last[1] = Math.max(last[1], curr[1]);   
            } else {
                merged.add(curr);  
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
