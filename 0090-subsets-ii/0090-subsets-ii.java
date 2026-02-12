class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        print(nums,0,sub,arr);
        return arr;
    }

    public void print(int[] nums,int idx,List<Integer> sub,List<List<Integer>> arr){
        if (idx==nums.length){
            arr.add(new ArrayList<>(sub));
            return;
        }

        sub.add(nums[idx]);
        print(nums,idx+1,sub,arr);
        sub.remove(sub.size()-1);
        
        while (idx+1<nums.length && nums[idx]==nums[idx+1]){
            idx++;
        }

        print(nums,idx+1,sub,arr);
    }
}