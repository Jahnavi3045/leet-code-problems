class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        ArrayList<Integer> list=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                list.add(matrix[i][j]);
            }
        }
        
        if(k>list.size()){
            return 0;
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i); 
        }
        Arrays.sort(arr);

        return arr[k-1];
    }
}