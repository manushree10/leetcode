class Solution {
    public int minMoves2(int[] nums) {
        // int n=nums.length;
        // Arrays.sort(nums);
        // int maxx=n/2;
        // int sum=0;
        // for(int i=0;i<n;i++)
        // {
        //     sum+=Math.abs(nums[i]-nums[maxx]);
        // }
        // return sum;
        Arrays.sort (nums);
        int left = 0, right = nums.length - 1, moves = 0;
        while (left < right){
            moves += nums [right] - nums [left];
            right--;
            left++;
        }
        return moves;
    }
}