class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));

        int currEnd=intervals[0][1];
        int ctr=0;

        for(int i=1;i<intervals.length;i++){
            int[] start=intervals[i];

            if(start[0]<currEnd){
                ctr++;
            }
            else{
                currEnd=start[1];
            }
        }

        return ctr;
    }
}