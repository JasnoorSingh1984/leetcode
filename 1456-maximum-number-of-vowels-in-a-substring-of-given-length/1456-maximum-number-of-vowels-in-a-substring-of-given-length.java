class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        for (int i=0;i<k;i++){
            char ch=s.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
                count++;
            }
        }

        int max=count;

        for (int i=k;i<s.length();i++){
            char right=s.charAt(i);
            char left=s.charAt(i-k);

            if (right=='a' || right=='e' || right=='i' || right=='o' || right=='u' || right=='A' || right=='E' || right=='I' || right=='O' || right=='U'){
                count++;
            }

            if (left=='a' || left=='e' || left=='i' || left=='o' || left=='u' || left=='A' || left=='E' || left=='I' || left=='O' || left=='U'){
                count--;
            }

            max=Math.max(max,count);
        }

        return max;
    }
}