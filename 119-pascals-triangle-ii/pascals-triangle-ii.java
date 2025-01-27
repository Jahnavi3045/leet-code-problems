class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();

        if(rowIndex==0){
            res.add(1);
            return res;
        }

        list.add(new ArrayList<>());
        list.get(0).add(1);

        for(int i=1;i<=rowIndex;i++){
            List<Integer> prev=list.get(i-1);
            List<Integer> newRow=new ArrayList<>();

            newRow.add(1);

            for(int j=1;j<prev.size();j++){
                newRow.add(prev.get(j-1)+prev.get(j));
            }
            newRow.add(1);

            list.add(newRow);
        }

        int x=list.get(list.size()-1).size();

        for(int i=0;i<x;i++){
            res.add(list.get(list.size()-1).get(i));
        }

        return res;
    }
}