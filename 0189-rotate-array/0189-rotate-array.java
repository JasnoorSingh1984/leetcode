class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        k=nums.length-k;

        swap(nums,0,k-1);
        swap(nums,k,nums.length-1);
        swap(nums,0,nums.length-1);
    }

    public void swap(int[] arr,int left,int right){
        while (left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}