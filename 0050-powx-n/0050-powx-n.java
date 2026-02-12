class Solution {
    public double power(double x,int n){
        if (n==1){
            return x;
        }

        if (n==0){
            return 1.0;
        }

        if (n<0){
            if (n==Integer.MIN_VALUE){
                return 1/(x*power(x,Integer.MAX_VALUE));
            }
            
            n=-n;
            return 1/power(x,n);
        }

        if (n%2==0){
            double half=power(x,n/2);
            return half*half;
        }

        double half=power(x,n/2);
        return half*half*x;
    }
    public double myPow(double x, int n) {
        return power(x,n);
    }
}