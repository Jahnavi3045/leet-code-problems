public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res=0;

        for(int i=0;i<32;i++){
            int lastBit=n&1;

            res=(res<<1)|lastBit;

            n>>=1;
        }

        return res;
    }
}