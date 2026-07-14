class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> arr=new ArrayList<>();
        HashSet<List<Integer>> set=new HashSet<>();

        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                HashSet<Integer> s=new HashSet<>();
                for (int k=j+1;k<nums.length;k++){
                    long rem=(long)target-nums[i]-nums[j]-nums[k];

                    if (rem>=Integer.MIN_VALUE && rem<=Integer.MAX_VALUE && s.contains((int)rem)){
                        List<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add((int)rem);

                        Collections.sort(list);

                        if (!set.contains(list)){
                            arr.add(list);
                            set.add(list);
                        }
                    }
                    s.add(nums[k]);
                }
            }
        }
        return arr;

    }
}