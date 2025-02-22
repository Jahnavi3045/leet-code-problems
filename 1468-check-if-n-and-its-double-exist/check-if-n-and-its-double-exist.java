class Solution {
    public boolean checkIfExist(int[] arr) {
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         if(i!=j && arr[i]==2*arr[j]){
        //             return true;
        //         }
        //     }
        // }
        HashSet<Integer> set=new HashSet<>();

        for(int num:arr){
            if(set.contains(num*2) || (set.contains(num/2)&& num%2==0)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}