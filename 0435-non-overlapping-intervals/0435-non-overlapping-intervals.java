class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));

        int count=0;
        int prevsp=arr[0][0];
        int prevep=arr[0][1];
        for (int i=1;i<arr.length;i++){
            int currsp=arr[i][0];
            int currep=arr[i][1];

            if (prevep<=currsp){
                prevsp=currsp;
                prevep=currep;
            }else{
                count++;
                prevsp=Math.max(prevsp,currsp);
                prevep=Math.min(prevep,currep);
            }
        }

        return count;
    }
}