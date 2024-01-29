class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        // String str=s.strip();
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)==' '){
        //         count =0;
        //     }
        //     else{
        //         count++;
        //     }
        // }
        // return count;

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }
            else{
                if(count>0){
                     return count;
                }
               
            }
        }
        return count;
    }
}