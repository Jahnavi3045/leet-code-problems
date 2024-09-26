class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter=0;
        int m=grid.length;
        int n=grid[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int a=4;
                if(grid[i][j]==1){
                    if(i-1>=0 && grid[i-1][j]==1){
                        a=a-1;
                    }
                    if(j-1>=0 && grid[i][j-1]==1){
                        a=a-1;
                    }
                    if(j+1<=n-1 && grid[i][j+1]==1){
                        a=a-1;
                    }
                    if( i+1<=m-1 && grid[i+1][j]==1){
                        a=a-1;
                    }
                    perimeter=perimeter+a;
                    
                }
            }
        }

        return perimeter;
    }
}