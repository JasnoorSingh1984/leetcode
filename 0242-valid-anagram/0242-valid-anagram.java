class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer> map=new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                int freq=map.get(s.charAt(i));
                map.put(s.charAt(i),freq+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }

        for (int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if (!map.containsKey(ch)){
                return false;
            }else{
                int freq=map.get(ch);
                if (freq==1){
                    map.remove(ch);
                }else{
                    map.put(ch,freq-1);
                }
            }
        }

        return map.isEmpty();
    }
}