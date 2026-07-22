class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int sum=0;
        int max=0;

        int left=0;
        int right=0;

        while (right<s.length()){
            sum+=Math.abs((int)t.charAt(right)-(int)s.charAt(right));

            while (sum>maxCost){
                sum-=Math.abs((int)t.charAt(left)-(int)s.charAt(left));
                left++;
            }

            max=Math.max(max,right-left+1);
            right++;
        }

        return max;
    }
}