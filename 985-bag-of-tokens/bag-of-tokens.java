class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);

        int left=0,right=tokens.length-1;
        int max=0,score=0;

        while(left<=right){
            if(tokens[left]<=power){
                score++;
                max=Math.max(score,max);
                power-=tokens[left];
                left++;
            }
            else if(score>=1 && power<=tokens[right]){
                score--;
                power+=tokens[right];
                right--;
            }
            else{
                return max;
            }
        }

        return max;
    }
}