class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> sk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                sk.push(')');    
            }
            else if(ch=='{'){
                sk.push('}');
            }
            else if(ch=='['){
                sk.push(']');
            }
            else{
                if(!sk.isEmpty() && ch==sk.peek()){
                    sk.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(sk.isEmpty()){
            return true;
        }
        return false;
    }
}