class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        StringBuilder sb=new StringBuilder(str);
        sb.reverse();

        for (int i=0;i<str.length();i++){
            if (str.charAt(i)!=sb.charAt(i)) return false;
        }

        return true;
    }
}