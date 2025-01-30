class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry:map1.entrySet()){
            if(!map2.containsKey(entry.getKey())){
                return false;
            }
            else if(map2.get(entry.getKey())<entry.getValue()){
                return false;
            }
        }

        return true;

    }
}