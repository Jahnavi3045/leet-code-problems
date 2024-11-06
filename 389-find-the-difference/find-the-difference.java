class Solution {
    public char findTheDifference(String s, String t) {
        // char[] sArr=s.toCharArray();
        // char[] tArr=t.toCharArray();

        // Arrays.sort(sArr);
        // Arrays.sort(tArr);

        // if(sArr.length==0){
        //     return tArr[0];
        // }

        // for(int i=0;i<tArr.length-1;i++){
        //     if(t.charAt(i)!=s.charAt(i)){
        //         return t.charAt(i);
        //     }
        // }

        // return tArr[tArr.length-1];
        int res=0;
        for(char ch:s.toCharArray()){
            res=res^ch;
        }
        for(char ch:t.toCharArray()){
            res=res^ch;
        }

        return (char)res;
    }
}