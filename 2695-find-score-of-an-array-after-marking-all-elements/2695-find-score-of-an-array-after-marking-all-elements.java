class Solution {
    public long findScore(int[] nums) {
        // int n=nums.length;
        // boolean[] mark=new boolean[n];
        // long score=0;
        // for(int i=0;i<n;i++)
        // {
        //     int minval=Integer.MAX_VALUE;
        //     int minindex=-1;
        //     for(int j=0;j<n;j++)
        //     {
        //         if(!mark[j] && nums[j]<minval)
        //         {
        //             minval=nums[j];
        //             minindex=j;

        //         }
        //     }
        //     if(minindex==-1)break;

        //   score+=nums[minindex];

        //   mark[minindex]=true;

        //   if (minindex - 1 >= 0) mark[minindex - 1] = true;
        //   if (minindex + 1 < n) mark[minindex + 1] = true;
        // }
        // return score;
        int n = nums.length;
        boolean[] marked = new boolean[n]; 
        long score = 0;

        
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]
        );

        
        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{nums[i], i});
        }

        
        while (!pq.isEmpty()) {
            int[] top = pq.poll();   
            int value = top[0];
            int idx = top[1];

            
            if (marked[idx]) continue;

            
            score += value;

            
            marked[idx] = true;
            if (idx - 1 >= 0) marked[idx - 1] = true;
            if (idx + 1 < n) marked[idx + 1] = true;
        }

        return score;
    }
}