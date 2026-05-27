class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> arr=new ArrayList<>();
        check(nums,0,arr);
        return arr;
    }

    public void check(int[] nums,int idx,List<List<Integer>> arr){
        if (idx==nums.length){
            List<Integer> l=new ArrayList<>();
            for (int i=0;i<nums.length;i++){
                l.add(nums[i]);
            }
            arr.add(l);
            return;
        }

        for (int i=idx;i<nums.length;i++){
            swap(nums,i,idx);
            check(nums,idx+1,arr);
            swap(nums,i,idx);
        }
    }

    public void swap(int[] nums,int i,int idx){
        int temp=nums[i];
        nums[i]=nums[idx];
        nums[idx]=temp;
    }
}