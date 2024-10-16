class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int n:nums){
            pq.add(n);
        }
        int n1 = pq.remove()-1;
        int n2 = pq.remove()-1;
        return n1*n2;
    }
}