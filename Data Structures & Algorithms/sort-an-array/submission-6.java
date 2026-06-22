class Solution {

    public void merge(int nums[],int si,int mid,int ei){
        int n1=mid-si+1;
        int n2=ei-mid;
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];

        for(int i=0;i<n1;i++){
            arr1[i]=nums[si+i];
        }

        for(int i=0;i<n2;i++){
            arr2[i]=nums[mid+i+1];
        }

        int i=0,j=0,k=si;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                nums[k]=arr1[i];
                i++;
            }
            else{
                nums[k]=arr2[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            nums[k]=arr1[i];
                i++;
                k++;
        }

        while(j<n2){
            nums[k]=arr2[j];
                j++;
                k++;
        }
    }

    public void mergesort(int nums[],int si,int ei){
        if(si<ei){
            int mid=si+(ei-si)/2;
            mergesort(nums,si,mid);
            mergesort(nums,mid+1,ei);
            merge(nums,si,mid,ei);
        }
    }

    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
}