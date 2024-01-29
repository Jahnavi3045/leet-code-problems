class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        String str=s.strip();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count =0;
            }
            else{
                count++;
            }
        }
        return count;
    }
}