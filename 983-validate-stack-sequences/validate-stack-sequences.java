class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();

        int popIdx=0;

        for(int i=0;i<pushed.length;i++){
            int num1=pushed[i];
            // if(st.isEmpty()){
            //     st.push(num1);
            // }
            // else{
                st.push(num1);
                while(!st.isEmpty() && popped[popIdx]==st.peek()){
                    st.pop();
                    popIdx++;
                // }
            }
        }
        
        
        return st.isEmpty();
    }
}