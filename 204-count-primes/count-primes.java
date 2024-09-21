class Solution {
    public int countPrimes(int n) {
        int[] res=new int[n];

        Arrays.fill(res,1);
        
        if(n==0 || n==1){
            return 0;
        }
        res[0]=res[1]=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(res[i]==1){
                for(int j=i+i;j<n;j+=i){
                    res[j]=0;
                }
            }
        }
        int count=0;
        for(int x:res){
            if(x==1){
                count++;
            }
        }

        return count;
    }
}