class Solution {
    public double myPow(double x, int n) {
        return power(x,n);
    }

    public double power(double x, int n){
        if (n==0){
            return 1.0;
        }

        if (n==1){
            return x;
        }

        if (n<0){
            if (n==Integer.MIN_VALUE){
                return 1/(x*power(x,Integer.MAX_VALUE));
            }
            n=-n;
            return 1/power(x,n);
        }

        double half=power(x,n/2);
        if (n%2==0){
            return half*half;
        }else{
            return x*half*half;
        }
    }
}