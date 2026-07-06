class Solution {
    void segregate0and1(int[] nums) {
        int[] arr=new int[nums.length];
        
        int k=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                arr[k++]=0;
            }
        }
        
        while (k<nums.length){
            arr[k++]=1;
        }
        
        for (int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        
    }
}
