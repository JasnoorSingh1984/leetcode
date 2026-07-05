class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<arr.length;i++){
            int rem=target-arr[i];

            if (map.containsKey(rem)){
                return new int[]{map.get(rem)+1,i+1};
            }else{
                map.put(arr[i],i);
            }
        }

        return new int[]{};
    }
}