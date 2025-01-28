class Solution {
    public String[] findWords(String[] words) {
        String l1="qwertyuiopQWERTYUIOP";
        String l2="asdfghjklASDFGHJKL";
        String l3="zxcvbnmZXCVBNM";

        ArrayList<String> list=new ArrayList<>();

        for(int i=0;i<words.length;i++){
            boolean flag=true;
            String str;
            if(l1.indexOf(words[i].charAt(0))!=-1){
                str=l1;
            }
            else if(l2.indexOf(words[i].charAt(0))!=-1){
                str=l2;
            }
            else{
                str=l3;
            }

            for(int j=1;j<words[i].length();j++){
                if(str.indexOf(words[i].charAt(j))==-1){
                    flag=false;
                    break;
                }
            }

            if(flag){
                list.add(words[i]);
            }

        }
        String[] res=new String[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }

        return res;
    }
}