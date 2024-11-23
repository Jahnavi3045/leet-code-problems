class Solution {
    public int trap(int[] height) {
       int n=height.length;

       int l=0,r=n-1;
       int lmax=0,rmax=0;

       int quantity=0;

       while(l<r){
        if(height[l]<height[r]){
            lmax=Math.max(lmax,height[l]);
            quantity+=lmax-height[l];
            l++;
        }
        else {
            rmax=Math.max(rmax,height[r]);
            quantity+=rmax-height[r];
            r--;
        }
       }

        return quantity;
    }
}