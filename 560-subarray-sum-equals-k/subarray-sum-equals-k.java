class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefixSum=0,ctr=0;
        for(int ele:nums){
            prefixSum+=ele;
            if(prefixSum==k){
                ctr++;
            }
            if(map.containsKey(prefixSum-k)){
                ctr+=map.get(prefixSum-k);
            }
            if(map.containsKey(prefixSum)){
                map.put(prefixSum,map.get(prefixSum)+1);
            }
            else{
                map.put(prefixSum,1);
            }
        }
        

        return ctr;
    }
}