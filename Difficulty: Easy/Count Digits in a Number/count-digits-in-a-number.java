class Solution {
    public static int countDigits(int n) {
        // Code here
        if (n==0){
            return 0;
        }
        
        int count=0;
        return count+1+countDigits(n/10);
    }
}
