class Solution {
    // int Binary_Search(int[] a,int val){
    //     int start = 0, end = a.length - 1, ans = -1; 
    //     while(start <= end) {
    //         int mid = start + (end - start) / 2;
    //         if(a[mid] <= val) {
    //             ans = mid;
    //             start = mid + 1;
    //         } else {
    //             end = mid - 1;
    //         }
    //     }
    //     return ans+1;
    // }

    public int[] answerQueries(int[] nums, int[] queries) {
    //     int n=nums.length;
    //     int m=queries.length;
    //     Arrays.sort(nums);
    //      int res[] = new int[m];
    //     for (int i = 1; i < n; ++i)
    //         nums[i] += nums[i - 1];
    //     for (int i = 0; i < m; ++i) {
    //         int j = Arrays.binarySearch(nums, queries[i]);
    //         res[i] = Math.abs(j + 1);
    //     }
    //     return res;

    Arrays.sort(nums);
        int[] answer = new int[queries.length];

        for(int i=0; i<queries.length; i++){
            int sum=0; int count = 0;
            for(int num : nums){
                if ( sum + num <= queries[i]){
                    sum+=num;
                    count++;
                }else break;
                answer[i] = count;
            }

        }
        return answer;
    }
}