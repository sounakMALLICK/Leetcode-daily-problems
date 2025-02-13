class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int ans[] = new int[n-k+1];
        for(int i=0; i<k; i++){
            while(!dq.isEmpty() && nums[i]>dq.getLast()){
                dq.removeLast();
            }
            dq.addLast(nums[i]);
        }
        ans[0] = dq.getFirst();

        for(int i=k; i<n; i++){
            if(nums[i-k]==dq.getFirst()){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[i]>dq.getLast()){
                dq.removeLast();
            }
            dq.addLast(nums[i]);
            ans[i-k+1] = dq.getFirst();
        }
        return ans;
    }
}