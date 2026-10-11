class Solution {
    public boolean isPowerOfThree(int n) {
        if (n<0) return false;

        long p=1;

        while (p<n){
            p*=3;
        }

        return p==n;
    }
}