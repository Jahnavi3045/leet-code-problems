class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int ele:nums){
            int digits=0;
            int x=0;
            while(ele!=0){
                x=ele%10;
                ele=ele/10;
                digits++;
            }
            if(digits%2==0){
                count++;
            }
        }
        return count;
    }
}