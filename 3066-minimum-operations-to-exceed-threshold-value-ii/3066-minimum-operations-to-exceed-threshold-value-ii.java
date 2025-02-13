class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            pq.add((long)nums[i]);
        }
        int count = 0;
        while(!pq.isEmpty() && pq.peek()<k){
            Long min = pq.remove();
            Long max = pq.remove();
            Long val = min*2+max;
            count++;
            pq.add(val);
        }
        return count;
    }
}