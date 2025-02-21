class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int prod=nums[i]*nums[j];
                map.put(prod,map.getOrDefault(prod,0)+1);
            }
        }

        int res=0;
        for(int val:map.values()){
            if(val>1){
                res+=val*(val-1)/2;
            }
        }

        return res*8;
    }
}