class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int res=0;
        if(timeSeries.length==0){
            return 0;
        }
        if(timeSeries.length==1){
            return duration;
        }

        for(int i=0;i<timeSeries.length-1;i++){
            if(timeSeries[i+1]>=timeSeries[i]+duration){
                res+=duration;
            }
            else if(timeSeries[i+1]<timeSeries[i]+duration){
                res+=timeSeries[i+1]-timeSeries[i];
            }
        }

        res+=duration;
        return res;
    }
}