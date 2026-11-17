class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> l=new ArrayList<>();

        Arrays.sort(nums);

        find(nums,target,0,arr,l);
        return arr;
    }

    public void find(int[] nums,int k,int idx,List<List<Integer>> arr,List<Integer> l){
        if (k==0){
            arr.add(new ArrayList<>(l));
            return;
        }

        for (int i=idx;i<nums.length;i++){
            if (i>idx && nums[i]==nums[i-1]) continue;
            if(nums[i]>k) break;

            l.add(nums[i]);
            k-=nums[i];
            find(nums,k,i+1,arr,l);
            l.remove(l.size()-1);
            k+=nums[i];
        }
    }
}