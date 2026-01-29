class Solution {
    public int sum=0;
    
    public void reverse(int n){
        if (n==0){
            return ;
        }
        
        int reminder=n%10;
        sum=sum*10+reminder;
        
        reverse(n/10);
    }
    
    public int power(int n,int x){
        if (x==0){
            return 1;
        }
        
        return n*power(n,x-1);
    }
    
    public int reverseExponentiation(int n) {
        sum=0;
        reverse(n);
        return power(n,sum);
    }
}
