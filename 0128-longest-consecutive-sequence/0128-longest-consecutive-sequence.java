class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();

        for (int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int max=0;
        for (int ch:set){
            if (set.contains(ch-1)){
                continue;
            }else{
                int x=ch;
                int count=1;
                while (set.contains(x+1)){
                    x=x+1;
                    count++;
                }
                max=Math.max(max,count);
            }
        }

        return max;
    }
}