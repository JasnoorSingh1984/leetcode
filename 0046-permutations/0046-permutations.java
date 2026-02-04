class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> arr=new ArrayList<>();
        print(nums,0,arr);
        return arr;
    }

    public void print(int[] nums,int idx,List<List<Integer>> arr){
        if (idx==nums.length-1){
            List<Integer> l=new ArrayList<>();
            for (int i=0;i<nums.length;i++){
                l.add(nums[i]);
            }
            arr.add(l);
            return;
        }

        for (int i=idx;i<nums.length;i++){
            swap(i,idx,nums);
            print(nums,idx+1,arr);
            swap(i,idx,nums);
        }
    }

    public void swap(int i,int idx,int[] nums){
        int temp=nums[i];
        nums[i]=nums[idx];
        nums[idx]=temp;
    }


}