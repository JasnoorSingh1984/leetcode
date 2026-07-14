class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set=new HashSet<>();
        List<List<Integer>> arr=new ArrayList<>();

        for (int i=0;i<nums.length;i++){
            HashSet<Integer> s=new HashSet<>();
            for (int j=i+1;j<nums.length;j++){
                int rem=-(nums[i]+nums[j]);

                if (s.contains(rem)){
                    List<Integer> l=new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(rem);
                    Collections.sort(l);

                    if (!set.contains(l)){
                        arr.add(l);
                        set.add(l);
                    }
                }

                s.add(nums[j]);
            }
        }

        return arr;
    }
}