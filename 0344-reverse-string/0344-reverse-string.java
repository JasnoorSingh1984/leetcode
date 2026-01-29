class Solution {
    public static void reverse(char[] s,int st,int ed){
        if (st>=ed){
            return;
        }

        char temp=s[st];
        s[st]=s[ed];
        s[ed]=temp;

        reverse(s,st+1,ed-1);
    }
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }
}