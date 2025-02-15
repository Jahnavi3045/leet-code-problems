class Solution {
    public int findMinArrowShots(int[][] points) {
        int arrows=0;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));

        int currEnd=points[0][1];
        arrows++;
        for(int i=1;i<points.length;i++){
            if(points[i][0]<=currEnd){
                continue;
            }
            else{
                arrows++;
                currEnd=points[i][1];
            }
        }

        return arrows;
    }
}