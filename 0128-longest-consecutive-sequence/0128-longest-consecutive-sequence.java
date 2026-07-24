class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        int max=0;
        for (Integer val:map.keySet()){
            if (map.containsKey(val-1)){
                continue;
            }else{
                int x=val;
                int count=1;
                while (map.containsKey(x+1)){
                    x=x+1;
                    count++;
                }

                max=Math.max(max,count);
            }
        }

        return max;
    }

}