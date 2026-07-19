class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        int count=0;
        int right=0;

        while (right<s.length()){
            char ch=s.charAt(right);

            map.put(ch,right);

            if (map.size()==3){
                int a=map.get('a');
                int b=map.get('b');
                int c=map.get('c');

                count += 1 + Math.min(Math.min(a,b),c);
            }

            right++;
        }
        
        return count;
    }
}