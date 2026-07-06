class Solution {
    public int maxPower(String s) {
        int max=0;

        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int count=1;
            max=Math.max(max,count);
            for (int j=i+1;j<s.length();j++){
                char ch1=s.charAt(j);
                if (ch!=ch1){
                    break;
                }

                count++;
                max=Math.max(max,count);
            }
        }

        return max;
    }
}