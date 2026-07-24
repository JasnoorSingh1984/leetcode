class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre=new int[nums.length];
        pre[0]=1;
        for (int i=1;i<nums.length;i++){
            pre[i]=nums[i-1]*pre[i-1];
        }

        int[] suff=new int[nums.length];
        suff[nums.length-1]=1;
        for (int i=nums.length-2;i>=0;i--){
            suff[i]=nums[i+1]*suff[i+1];
        }

        int[] ans=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            ans[i]=pre[i]*suff[i];
        }

        return ans;
    }
}