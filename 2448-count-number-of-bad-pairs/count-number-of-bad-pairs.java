class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        long tp=(1L*n*(n-1))/2;
        long gp=0;

        for(int i=0;i<nums.length;i++){
            int diff=i-nums[i];
            if(map.containsKey(diff)){
                gp+=map.get(diff);
            }
            map.put(diff,map.getOrDefault(diff,0)+1);
        }

        long bp=tp-gp;

        return bp;
    }
}