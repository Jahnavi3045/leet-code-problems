class Solution {
    public int diagonalPrime(int[][] nums) {
        int m=nums.length;
        int n=nums[0].length;
        int maxPrime=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    if(isPrime(nums[i][j])){
                            maxPrime=Math.max(maxPrime,nums[i][j]);  
                    }
                }
            }
        }

        return maxPrime;

    }
    public boolean isPrime(int x){
        if (x==0 || x==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}