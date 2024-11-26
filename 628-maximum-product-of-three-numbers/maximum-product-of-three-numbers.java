class Solution {
    public int maximumProduct(int[] nums) {
        int maxProd1=1,maxProd2=1;

        Arrays.sort(nums);
        int n=nums.length;

        maxProd1=nums[0]*nums[1]*nums[n-1];
        maxProd2=nums[n-1]*nums[n-2]*nums[n-3];

        return Math.max(maxProd1,maxProd2);
    }
}