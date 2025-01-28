class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map=new HashMap<>();

        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }

        int minSum=Integer.MAX_VALUE;

        ArrayList<String> result=new ArrayList<>();
        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                int j=map.get(list2[i]);
                int sum=i+j;
                if(sum<minSum){
                    minSum=sum;
                    result.clear();
                    result.add(list2[i]);
                }
                else if(sum==minSum){
                    result.add(list2[i]);
                }
            }
        }
        String[] res=new String[result.size()];

        for(int i=0;i<result.size();i++){
            res[i]=result.get(i);
        }

        return res;
    }
}