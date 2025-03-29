class Solution {
    public int largestPerimeter(int[] nums) {
        int max=0;
        Arrays.sort(nums);

        for(int i=nums.length-1;i>=2;i--){
            if(isTriangle(nums[i],nums[i-1],nums[i-2])){
                max=nums[i]+nums[i-1]+nums[i-2];
                return max;
            }
        }

        return max;
    }

    public boolean isTriangle(int x,int y,int z){
        if(x+y>z && x+z>y && y+z>x){
            return true;
        }

        return false;
    }
}