class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();

        for (int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        int left=0;
        int right=0;
        int minlen=Integer.MAX_VALUE;
        int start=-1;
        int count=map.size();

        while (right<s.length()){
            char ch=s.charAt(right);
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if (map.get(ch)==0){
                    count--;
                }
            }

            while (count==0){
                if (right-left+1 < minlen){
                    minlen=right-left+1;
                    start=left;
                }

                char leftchar=s.charAt(left);
                if(map.containsKey(leftchar)){
                    int freq=map.get(leftchar);
                    freq=freq+1;
                    map.put(leftchar,freq);

                    if (freq>0){
                        count++;
                    }
                }
                left++;
            }

            right++;
        }

        if(minlen==Integer.MAX_VALUE){
            return "";
        }else{
            return s.substring(start,start+minlen);
        }
    }
}