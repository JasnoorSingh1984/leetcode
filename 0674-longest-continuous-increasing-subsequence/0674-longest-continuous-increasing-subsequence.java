class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max=0;
        for (int i=0;i<nums.length;i++){
            int count=1;
            max=Math.max(max,count);
            for (int j=i+1;j<nums.length;j++){
                if (nums[j-1]<nums[j]){
                    count++;
                    max=Math.max(max,count);
                }else{
                    break;
                }
            }
        }

        return max;
    }
}