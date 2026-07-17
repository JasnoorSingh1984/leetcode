class Solution {
    public int trap(int[] nums) {
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        for (int i=1;i<nums.length;i++){
            prefix[i]=Math.max(prefix[i-1],nums[i]);
        }

        int[] sufix=new int[nums.length];
        sufix[nums.length-1]=nums[nums.length-1];
        for (int i=nums.length-2;i>=0;i--){
            sufix[i]=Math.max(sufix[i+1],nums[i]);
        }

        int total=0;
        for (int i=0;i<nums.length;i++){
            total+=Math.min(prefix[i],sufix[i])-nums[i];
        }

        return total;
    }
}