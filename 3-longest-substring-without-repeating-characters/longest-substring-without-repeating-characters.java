class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1){
            return 1;
        }
        int maxLength=0;
        HashSet<Character> set=new HashSet<>();
        int left=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);

            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);

            maxLength=Math.max(maxLength,right-left+1);
        }

        return maxLength;
    }
}