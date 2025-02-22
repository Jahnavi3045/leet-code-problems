class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res=new ArrayList<>();

        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        for(int num:nums1){
            set1.add(num);
        }

        for(int num:nums2){
            set2.add(num);
        }
        List<Integer> diff1=new ArrayList<>(set1);
        // for(int num:set1){
        //     if(!set2.contains(num)){
        //         diff1.add(num);
        //     }
        // }
        diff1.removeAll(set2);
        res.add(diff1);
        List<Integer> diff2=new ArrayList<>(set2);
        // for(int num:set2){
        //     if(!set1.contains(num)){
        //         diff2.add(num);
        //     }
        // }
        diff2.removeAll(set1);
        res.add(diff2);

        return res;
    }
}