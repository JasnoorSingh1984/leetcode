class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int max=0;
        for (int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for (int ch:set){
            if (set.contains(ch-1)){
                continue;
            }else{
                int count=1;
                int x=ch;
                while (set.contains(x+1)){
                    count++;
                    x=x+1;
                }

                max=Math.max(max,count);
            }
        }

        return max;
    }
}