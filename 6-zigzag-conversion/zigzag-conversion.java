class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }

        StringBuilder[] rows=new StringBuilder[numRows];

        for(int i=0;i<rows.length;i++){
            rows[i]=new StringBuilder();
        }

        int currRow=0;
        boolean isGoingDown=false;

        for(int i=0;i<s.length();i++){
            rows[currRow].append(s.charAt(i));

            if(currRow==0 || currRow==numRows-1){
                isGoingDown=!isGoingDown;
            }

            currRow+=isGoingDown?1:-1;
        }

        StringBuilder result=new StringBuilder();
        for(StringBuilder row:rows){
            result.append(row);
        }

        return result.toString();
    }
}