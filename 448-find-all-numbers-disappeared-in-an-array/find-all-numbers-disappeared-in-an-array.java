class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }

        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}