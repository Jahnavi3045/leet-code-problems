class Solution {
    public String simplifyPath(String path) {
        Stack<String> sk=new Stack<>();

        String[] arr=path.split("/");

        for(String s:arr){
            if(s.equals(".") || s.isEmpty()){
                continue;
            }
            else if(s.equals("..")){
                if(!sk.isEmpty()){
                    sk.pop();
                }
            }
            else{
                sk.push(s);
            }
        }  
        StringBuilder sb=new StringBuilder();
        for(String dir:sk){
            sb.append("/");
            sb.append(dir);
        }

        return sb.length()==0?"/":sb.toString();
    }
}