class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                int freq=map.get(nums[i]);
                map.put(nums[i],freq+1);
            }else{
                map.put(nums[i],1);
            }
        }

        int x=0;
        for (Integer val:map.keySet()){
            if (map.get(val)==2){
                x^=val;
            }
        }

        return x;
    }
}