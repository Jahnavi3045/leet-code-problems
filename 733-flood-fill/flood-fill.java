class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color){
            return image;
        }
        int m=image.length;
        int n=image[0].length;

        int oc=image[sr][sc];
        dfs(sr,sc,oc,color,image);

        return image;
    }

    void dfs(int r,int c,int oc,int color,int[][] img){
        int n=img.length;
        int m=img[0].length;
        int[][] dir={{-1,0},{1,0},{0,1},{0,-1}};
        img[r][c]=color;

        for(int[] d:dir){
            int newr=r+d[0];
            int newc=c+d[1];

            if(0<=newr && newr<n && 0<=newc && newc<m && img[newr][newc]==oc){
                dfs(newr,newc,oc,color,img);
            }
        }
    }
}