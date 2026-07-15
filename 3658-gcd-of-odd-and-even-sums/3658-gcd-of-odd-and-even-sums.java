class Solution {
    public int gcd(int i,int j){
        if (j==0){
            return i;
        }
        return gcd(j,i%j);
    }
    public int gcdOfOddEvenSums(int n) {
        int even=0;
        int odd=0;
        for (int i=1;i<=2*n;i++){
            if (i%2==0){
                even+=i;
            }else{
                odd+=i;
            }
        }

        return gcd(even,odd);
    }
}