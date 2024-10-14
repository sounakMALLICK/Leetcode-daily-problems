class Solution {
    public long maxKelements(int[] nums, int k) {
        long score = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }
        while(k>0){
            int remove = pq.remove();
            score += remove;
            pq.add((remove+2)/3);
            k--;
        }
        return score;
    }
}