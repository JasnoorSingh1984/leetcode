class Solution {
    public int removeElement(int[] nums, int val) {
        int left=-1;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==val){
                left=i;
                break;
            }
        }

        if (left==-1){
            return nums.length;
        }

        int right=left+1;

        while (right<nums.length){
            if (nums[right]!=val){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;

                left++;
            }

            right++;
        }

        return left;
    }
}