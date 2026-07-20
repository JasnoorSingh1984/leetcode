class Solution {
    public int[] replaceElements(int[] arr) {
        int[] nums=new int[arr.length];
        int max=arr[arr.length-1];

        nums[nums.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            nums[i]=max;
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return nums;
    }
}