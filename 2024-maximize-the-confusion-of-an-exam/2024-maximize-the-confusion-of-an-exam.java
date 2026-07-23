class Solution {
    public int get(String s,int k,char ch){
        int max=0;
        int left=0;
        int right=0;
        int count=0;

        while (right<s.length()){
            if (s.charAt(right)!=ch){
                count++;
            }

            while (count>k){
                if (s.charAt(left)!=ch){
                    count--;
                }
                left++;
            }

            max=Math.max(max,right-left+1);
            right++;
        }

        return max;
    }
    public int maxConsecutiveAnswers(String s, int k) {
        return Math.max(get(s,k,'T'),get(s,k,'F'));
    }
}