class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr=new int[nums.length];

        int m=0;
        k=k%nums.length;
        k=nums.length-k;

        for (int i=k;i<nums.length;i++){
            arr[m++]=nums[i];
        }

        for (int i=0;i<k;i++){
            arr[m++]=nums[i];
        }

        for (int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    }
}