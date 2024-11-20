class Solution {
    public boolean isUgly(int n) {
        if(n==0){
            return false;
        }
        // for(int i=2;i<n;i++){
        //     if(i!=2 && i!=3 && i!=5 && n%i==0){
        //         return false;
        //     }
        // }
        if(1<=n && n<=3){
            return true;
        }
        while (n % 2 == 0) {
            n /= 2;
        }

        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        return n==1;
    }
}