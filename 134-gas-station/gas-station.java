class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas=0,totalCost=0;
        int idx=0,fuel=0;

        for(int i=0;i<gas.length;i++){
            totalGas+=gas[i];
            totalCost+=cost[i];

            fuel+=gas[i]-cost[i];

            if(fuel<0){
                idx=i+1;
                fuel=0;
            }
        }

        return (totalGas<totalCost)?-1:idx;
    }
}