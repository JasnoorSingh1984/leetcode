class Solution {
    public int findMinArrowShots(int[][] arr) {
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));

        int count=1;

        int prevsp=arr[0][0];
        int prevep=arr[0][1];
        for (int i=1;i<arr.length;i++){
            int currsp=arr[i][0];
            int currep=arr[i][1];

            if (prevep < currsp){
                count++;
                prevsp=currsp;
                prevep=currep;
            }else{
                prevsp=Math.max(prevsp,currsp);
                prevep=Math.min(prevep,currep);
            }
        }

        return count;
    }
}