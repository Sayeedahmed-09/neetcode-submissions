class Solution {
    public int removeElement(int[] nums, int val) {

        int n=nums.length;
        int count=0;
        int j=0;

        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                count++;
            }
        }
        int arr[]=new int[count];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                arr[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<count;i++){
            nums[i]=arr[i];
        }

        return count;
    }
}