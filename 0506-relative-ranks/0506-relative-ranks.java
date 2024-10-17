class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : score){
            max.add(n);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        while(max.size()>0){
            int rem = max.remove();
            map.put(rem, rank++);
        }
        String ans[] = new String[score.length];
        for(int i=0; i<ans.length; i++){
            if(map.get(score[i])==1){
                ans[i] = "Gold Medal";
            }
            else if(map.get(score[i])==2){
                ans[i] = "Silver Medal";
            }
            else if(map.get(score[i])==3){
                ans[i] = "Bronze Medal";
            }
            else{
                ans[i] = Integer.toString(map.get(score[i]));
            }
        }
        return ans;
    }
}