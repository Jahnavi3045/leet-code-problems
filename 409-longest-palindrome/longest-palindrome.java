class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int ctr=0,odd=0;
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int val:map.values()){
            ctr+=2*(val/2);
            if(val%2==1){
                odd=1;
            }
        }

        return ctr+odd;
    }
}