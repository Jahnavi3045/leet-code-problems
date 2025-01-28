class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;

        int[] res=new int[m];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums2[i],i);
        }
        for(int i=0;i<m;i++){
            int j=map.get(nums1[i]);
            for(int k=j+1;k<n;k++){
                if(nums2[k]>nums1[i]){
                    res[i]=nums2[k];
                    break;
                }
            }
            
        }

        for(int i=0;i<m;i++){
            if(res[i]==0){
                res[i]=-1;
            }
        }
        return res;
    }
}