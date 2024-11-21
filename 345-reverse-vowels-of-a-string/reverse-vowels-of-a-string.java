class Solution {
    public String reverseVowels(String s) {
        String vowels="aeiouAEIOU";
        ArrayList<Character> list=new ArrayList<>();
        for(char ch:s.toCharArray()){
            if(vowels.contains(ch+"")){
                list.add(ch);
            }
        }
        Collections.reverse(list);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(vowels.contains(ch+"")){
                sb.append(list.get(0));
                list.remove(0);
            }
            else{
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}