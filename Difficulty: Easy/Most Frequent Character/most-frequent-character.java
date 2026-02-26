class Solution {
    public char getMaxOccuringChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if (map.containsKey(ch)){
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }else{
                map.put(ch,1);
            }
        }
        
        int max=0;
        char ch=;
        for (char ele:map.keySet()){
            int freq=map.get(ele);
            if (freq>max){
                max=freq;
                ch=ele;
            }else if (freq==max){
                if (ele<ch){
                    ch=ele;
                }
            }
        }
        
        return ch;
    }
}