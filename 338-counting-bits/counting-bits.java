class Solution {
    public int[] countBits(int n) {
        int[] result=new int[n+1];
        for(int i=0;i<n+1;i++){
            String bin=Integer.toBinaryString(i);
            int count=0;
            for(int j=0;j<bin.length();j++){
                char ch=bin.charAt(j);

                if(ch=='1'){
                    count++;
                }
            }
            result[i]=count;
        }
        return result;
    }
}