class Solution {
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n : arr){
            pq.add(n);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        while(pq.size()>0){
            int rem = pq.remove();
            if(!map.containsKey(rem)){
                map.put(rem, rank);
                rank++;
            }
        }
        int ans[] = new int[arr.length];
        for(int i=0; i<ans.length; i++){
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}