class Solution {
    public int atmost(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int left=0;
        int right=0;

        while (right<nums.length){
            if(map.containsKey(nums[right])){
                map.put(nums[right],map.get(nums[right])+1);
            }else{
                map.put(nums[right],1);
            }

            while (map.size()>k){
                int freq=map.get(nums[left]);
                map.put(nums[left],freq-1);
                if (map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }

            count+=right-left+1;

            right++;
        }

        return count;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
}