class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : gifts){
            pq.add(n);
        }

        while(k>0){
            int rem = pq.remove();
            pq.add((int) Math.sqrt(rem));
            k--;
        }
        long sum = 0;
        while(pq.size()>0){
            sum += pq.remove();
        }
        return sum;
    }
}