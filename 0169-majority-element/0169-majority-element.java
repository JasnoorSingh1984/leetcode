class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        int max=0;
        int ele=-1;
        for (int val:map.keySet()){
            if (map.get(val)>max){
                max=map.get(val);
                ele=val;
            }
        }

        return ele;
    }
}