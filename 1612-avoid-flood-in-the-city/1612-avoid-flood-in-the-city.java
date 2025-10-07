class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        HashMap<Integer, Integer> lastRain = new HashMap<>();
        TreeSet<Integer> dryDays = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                dryDays.add(i);
                ans[i] = 1;  
            } else {
                ans[i] = -1;
                int lake = rains[i];
                
                if (lastRain.containsKey(lake)) {
                    int lastDay = lastRain.get(lake);
                    Integer dryDay = dryDays.higher(lastDay); 
                    if (dryDay == null) return new int[0]; 
                    
                    ans[dryDay] = lake; 
                    dryDays.remove(dryDay);
                }
                lastRain.put(lake, i);
            }
        }
        return ans;
    }
}