class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list=new ArrayList<>();

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        list.add(new int[]{intervals[0][0],intervals[0][1]});

        for(int i=1;i<intervals.length;i++){
            int[] curr=intervals[i];
            int[] prev=list.get(list.size()-1);

            if(curr[0]<=prev[1]){
                prev[1]=Math.max(prev[1],curr[1]);
            }
            else{
                list.add(curr);
            }
        }

        int[][] res=list.toArray(new int[list.size()][]);

        return res;
        
    }
}