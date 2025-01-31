class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Character,String> mapC=new HashMap<>();
        HashMap<String,Character> mapS=new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            if(mapC.containsKey(pattern.charAt(i))){
                if(!mapC.get(pattern.charAt(i)).equals(words[i])){
                    return false;
                }
            }
            else{
                mapC.put(pattern.charAt(i),words[i]);
            }

            if(mapS.containsKey(words[i])){
                if(mapS.get(words[i])!=pattern.charAt(i)){
                    return false;
                }
            }
            else{
                mapS.put(words[i],pattern.charAt(i));
            }
        }

        return true;
        
    }
}