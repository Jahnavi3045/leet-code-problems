class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> list=new ArrayList<>();

        int i=0;
        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            list.add(intervals[i]);
            i++;
        }

        while(i<intervals.length && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        list.add(newInterval);

        while(i<intervals.length){
            list.add(intervals[i]);
            i++;
        }

        int[][] res=list.toArray(new int[list.size()][]);

        return res;
    }
}