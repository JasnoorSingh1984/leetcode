class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        StringBuilder sb=new StringBuilder();

        while (!map.isEmpty()){
            int max=Integer.MIN_VALUE;
            char ch=' ';

            for (Character cha:map.keySet()){
                if (map.get(cha)>max){
                    max=map.get(cha);
                    ch=cha;
                }
            }

            for (int i=0;i<max;i++){
                sb.append(ch);
            }

            map.remove(ch);
        }

        return sb.toString();
    }
}