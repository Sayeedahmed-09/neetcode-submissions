class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int res=nums[0];

        while(low<=high){
            if(nums[low]<nums[high]){
                res=Math.min(res,nums[low]);
                break;
            }

            int mid=low+(high-low)/2;
            if(nums[mid]>=nums[low]){
                low=mid+1;
            }else{
                high=mid-1;
            }
            res=Math.min(res,nums[mid]);
        }
        return res;
    }
}
