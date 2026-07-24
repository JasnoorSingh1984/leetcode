class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();

        for (int i=0;i<strs.length;i++){
            String str=strs[i];
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);

            if (map.containsKey(key)){
                List<String> l=map.get(key);
                l.add(str);
                map.put(key,l);
            }else{
                List<String> l=new ArrayList<>();
                l.add(str);
                map.put(key,l);
            }
        }

        List<List<String>> ans=new ArrayList<>();
        for (List<String> l:map.values()){
            ans.add(l);
        }

        return ans;
    }
}