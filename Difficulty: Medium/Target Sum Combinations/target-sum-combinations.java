class Solution {
    public ArrayList<ArrayList<Integer>> targetSumComb(int[] nums, int target) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        
        subs(nums,0,l,arr,target);
        // Collections.sort(arr);
        return arr;
    }
    
    public void subs(int[] nums,int idx,ArrayList<Integer> l,ArrayList<ArrayList<Integer>> arr,int target){
        if (idx==nums.length){
            if (target==0){
                arr.add(new ArrayList<>(l));
            }
            return;
        }
        
        if (nums[idx]<=target){
            l.add(nums[idx]);
            target-=nums[idx];
            subs(nums,idx,l,arr,target);
            l.remove(l.size()-1);
            target+=nums[idx];
        }
        
        subs(nums,idx+1,l,arr,target);
    }
}