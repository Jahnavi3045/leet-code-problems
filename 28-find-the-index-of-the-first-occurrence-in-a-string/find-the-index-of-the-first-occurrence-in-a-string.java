class Solution {
    public int strStr(String haystack, String needle) {
        // if(haystack.length()<needle.length()){
        //     return -1;
        // }
        
        // int index=0;
        // for(int i=0;i<haystack.length();i++){
        //     if(haystack.charAt(i)==needle.charAt(index)){
        //         index++;
        //     }
        //     else{
        //         i=i-index;
        //         index=0;
        //     }
        //     if(index==needle.length()){
        //         return i-needle.length()+1;
        //     }
        // }
        // return -1;

        return haystack.indexOf(needle);
    }
}