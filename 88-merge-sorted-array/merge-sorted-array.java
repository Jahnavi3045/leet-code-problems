class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int k=m+n-1;
        // int i=m-1,j=n-1;

        // while(j>=0){
        //     if (i>=0 && nums1[i]>=nums2[j]){
        //         nums1[k]=nums1[i];
        //         k--;
        //         i--;
        //     }
        //     else{
        //         nums1[k]=nums2[j];
        //         k--;
        //         j--;
        //     }
        // }
        


        int x=m;
        for(int i=0;i<n;i++){
            nums1[x]=nums2[i];
            x++;
        }
       
        Arrays.sort(nums1);


    }
}