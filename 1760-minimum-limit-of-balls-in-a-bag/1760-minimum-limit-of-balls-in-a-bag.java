class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }
        
        while(maxOperations>0){
            int x = pq.remove();
            if(x%2==0){
                pq.add(x/2);
                pq.add(x/2);
            }
            else{
                pq.add((x/2)+2);
                pq.add((x/2)-1);
            }
            maxOperations--;
        }
        return pq.peek();
    }
}