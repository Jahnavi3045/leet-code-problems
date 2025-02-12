class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        int[] freq=new int[n+1];
        List<Integer> res=new ArrayList<>();

        for(int ele:nums){
            freq[ele]++;
            if(freq[ele]==2){
                res.add(ele);
            }
        }

        return res;
    }
}