// User function Template for Java
class Solution {
    static long series(int n){
        if (n==1){
            return 0;
        }
        if (n==2){
            return 1;
        }
        
        long t1=series(n-2);
        long t2=series(n-1);
        
        return t1*t1-t2;
    }
    static void gfSeries(int n) {
        for (int i=1;i<=n;i++){
            System.out.print(series(i) + " ");
        }
        System.out.println();
    }
    
}