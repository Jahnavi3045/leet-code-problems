class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            set2.add(num);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int ele:set1){
            if(set2.contains(ele)){
                res.add(ele);
            }
        }
        int[] intArray = res.stream().mapToInt(Integer::intValue).toArray();

        return intArray;
    }
}