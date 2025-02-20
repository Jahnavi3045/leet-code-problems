class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:tasks){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int max_freq=Collections.max(map.values());
        int max_tasks=0;

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==max_freq){
                max_tasks++;
            }
        }
        int needed=(max_freq-1)*(n+1)+max_tasks;

        return Math.max(needed,tasks.length);
    }
}