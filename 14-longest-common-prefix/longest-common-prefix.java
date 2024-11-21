class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        Arrays.sort(strs);
        int n=strs[0].length();
        for(int i=0;i<n;i++){
            for(int j=1;j<strs.length;j++){
                if(strs[0].charAt(i)!=strs[j].charAt(i)){
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));
        }

        return sb.toString();
    }
}