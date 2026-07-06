class Solution {
    public int missingNumber(int[] nums) {
        for (int i=0;i<nums.length;i++){
            boolean found=false;

            for (int ch:nums){
                if (ch==i){
                    found=true;
                    break;
                }
            }

            if (!found){
                return i;
            }
        }

        return nums.length;
    }
}