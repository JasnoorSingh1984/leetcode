class Solution {
    public int totalFruit(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int left=0;
        int right=0;

        while (right<nums.length){
            if (map.containsKey(nums[right])){
                int freq=map.get(nums[right]);
                map.put(nums[right],freq+1);
            }else{
                map.put(nums[right],1);
            }

            while (map.size()>2){
                int freq=map.get(nums[left]);
                map.put(nums[left],freq-1);
                if (map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }

            max=Math.max(max,right-left+1);
            right++;
        }

        return max;
    }
}