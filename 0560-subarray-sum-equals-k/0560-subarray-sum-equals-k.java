class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

        map.put(0,1);
        int count=0;
        int sum=0;

        int j=0;
        while (j<nums.length){
            sum+=nums[j];
            int rem=sum-k;

            if (map.containsKey(rem)){
                count+=map.get(rem);
            }

            if (map.containsKey(sum)){
                int freq=map.get(sum);
                map.put(sum,freq+1);
            }else{
                map.put(sum,1);
            }

            j++;
                        
        }

        return count;
    }
}