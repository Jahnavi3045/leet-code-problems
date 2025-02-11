class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        if(strs.length==0){
            return new ArrayList<>();
        }
        for(String str:strs){
            char[] charArr=str.toCharArray();
            Arrays.sort(charArr);
            String key=new String(charArr);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}