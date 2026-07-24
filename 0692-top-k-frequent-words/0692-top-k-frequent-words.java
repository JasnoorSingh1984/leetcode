class Solution {
    public List<String> topKFrequent(String[] nums, int k) {
        HashMap<String,Integer> map=new HashMap<>();

        for (int i=0;i<nums.length;i++){
            String str=nums[i];

            if (map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }else{
                map.put(str,1);
            }
        }

        List<String> list=new ArrayList<>();
        for (int i=0;i<k;i++){
            int max=Integer.MIN_VALUE;
            String val="";

            for (String str:map.keySet()){
                if (map.get(str)>max){
                    max=map.get(str);
                    val=str;
                }else if (map.get(str) == max && str.compareTo(val) < 0) {
                    val = str;
                }
            }

            list.add(val);
            map.remove(val);
        }

        return list;
    }
}