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
            swap(nums,i,idx);
            print(nums,idx+1,arr);
            swap(nums,i,idx);
        }
    }

    public void swap(int[] arr,int i,int idx){
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }
}