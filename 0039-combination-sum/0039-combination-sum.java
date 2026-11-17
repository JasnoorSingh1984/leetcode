class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();

        Arrays.sort(arr);

        find(arr,target,0,ans,l);
        return ans;
    }

    public void find(int[] nums,int k,int idx,List<List<Integer>> ans,List<Integer> l){
        if (idx>=nums.length) return;

        if (k==0){
            ans.add(new ArrayList<>(l));
            return;
        }

        if (nums[idx]<=k){
            l.add(nums[idx]);
            k-=nums[idx];
            find(nums,k,idx,ans,l);
            l.remove(l.size()-1);
            k+=nums[idx];
        }

        find(nums,k,idx+1,ans,l);
    }


}