class Solution {
    public char findTheDifference(String s, String t) {
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
            if(!map.containsKey(t.charAt(i))){
                return t.charAt(i);
            }else{
                if (map.get(t.charAt(i))==1){
                    map.remove(t.charAt(i));
                }else{
                    int freq=map.get(t.charAt(i));
                    map.put(t.charAt(i),freq-1);
                }
            }
        }

        return ' ';
    }
}