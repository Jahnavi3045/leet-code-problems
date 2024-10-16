class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] answer=new String[n];

        // int[] sortedArray = Arrays.stream(score)
        //                           .boxed() // Box each int to Integer
        //                           .sorted(Collections.reverseOrder()) // Sort in reverse order
        //                           .mapToInt(Integer::intValue) // Unbox back to int
        //                           .toArray(); // Collect to int array
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:score){
            list.add(num);
        }
        Collections.sort(list,Collections.reverseOrder());

        for(int i=0;i<n;i++){
            if(score[i]==list.get(0)){
                answer[i]="Gold Medal";
            }
            else if(score[i]==list.get(1)){
                answer[i]="Silver Medal";
            }
            else if(score[i]==list.get(2)){
                answer[i]="Bronze Medal";
            }
            else{
                int idx=list.indexOf(score[i]);
                answer[i]=Integer.toString(idx+1);
            }
        }

        return answer;
    }
}