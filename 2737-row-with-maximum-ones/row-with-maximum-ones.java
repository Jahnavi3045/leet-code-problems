class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int max=0;
        int row=0;
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                count+=mat[i][j];
            }
            if(count>max){
                max=count;
                row=i;
            }
        }
        int[] res=new int[2];
        res[0]=row;
        res[1]=max;

        return res;
    }
}