class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        int maxele=0;

        int left=0;
        int right=0;
        
        while (right<s.length()){
            char ch=s.charAt(right);
            if (map.containsKey(ch)){
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }else{
                map.put(ch,1);
            }

            maxele=Math.max(maxele,map.get(ch));

            while ((right-left+1)-maxele > k){
                int freq=map.get(s.charAt(left));
                map.put(s.charAt(left),freq-1);
                left++;
            }

            max=Math.max(max,(right-left+1));
            right++;
        }

        return max;
    }
}