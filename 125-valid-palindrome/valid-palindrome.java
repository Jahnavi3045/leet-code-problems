class Solution {
    public boolean isPalindrome(String s) {
        if(s==""){
            return true;
        }
        String str="";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || Character.isAlphabetic(s.charAt(i))){
                str+=s.charAt(i);
            }
        }
        
        str=str.toLowerCase();

        String revStr="";
        for(int i=str.length()-1;i>=0;i--){
            revStr+=str.charAt(i);
        }

        return str.equals(revStr);
    }
}