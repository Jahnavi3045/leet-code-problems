class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int dist=0;
        List<Integer> arr1=arrays.get(0);

        int large=arr1.get(arr1.size()-1);
        int small=arr1.get(0);

        // dist=large-small;

        for(int i=1;i<arrays.size();i++){
            List<Integer> temp=arrays.get(i);
            int n=temp.size();

            int tl=temp.get(n-1);
            int ts=temp.get(0);
            
            int x=tl-small;
            int y=large-ts;
            dist=Math.max(dist,Math.max(tl-small,large-ts));

            // if(x>dist && x>y){
            //     large=tl;
            //     dist=x;
            // }
            // else if(y>dist && y>x){
            //     small=ts;
            //     dist=y;
            // }
            large=Math.max(tl,large);
            small=Math.min(small,ts);

        }

        return dist;
    }
}