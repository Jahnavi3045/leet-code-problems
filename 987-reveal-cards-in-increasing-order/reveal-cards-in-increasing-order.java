class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<n;i++){
            q.offer(i);
        }
        Arrays.sort(deck);
        int[] result=new int[n];

        for(int i=0;i<n;i++){
            int j=q.poll();
            result[j]=deck[i];
            if(!q.isEmpty()){
                q.offer(q.poll());
            }
        }

        return result;
    }
}