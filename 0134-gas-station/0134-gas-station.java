class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gases=0;
        for (int i=0;i<gas.length;i++){
            gases+=gas[i];
        }

        int costes=0;
        for (int i=0;i<cost.length;i++){
            costes+=cost[i];
        }

        if (costes>gases) return -1;

        int total=0;
        int result=0;

        for (int i=0;i<gas.length;i++){
            total += gas[i]-cost[i];

            if (total<0){
                total=0;
                result=i+1;
            }
        }

        return result;
    }
}