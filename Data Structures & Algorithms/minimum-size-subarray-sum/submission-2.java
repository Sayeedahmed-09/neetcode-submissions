class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int windowLength=Integer.MAX_VALUE;
        int sum=0;
        for(int high=0;high<nums.length;high++){
            sum+=nums[high];

            while(sum>=target){
                int currWindow=high-low+1;
                windowLength=Math.min(windowLength,currWindow);
                sum-=nums[low];
                low++;
            }
        }
        return windowLength==Integer.MAX_VALUE?0:windowLength;
    }
}