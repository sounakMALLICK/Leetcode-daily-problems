class Solution {
    public int[] numberGame(int[] nums) {
        int ans[] = new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n : nums){
            pq.add(n);
        }
        int i = 0;
        while(pq.size()>0){
            int r1 = pq.remove();
            int r2 = pq.remove();
            ans[i++] = r2;
            ans[i++] = r1;
        }
        return ans;
    }
}