class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int i=0; i<weights.length; i++){
            if(weights[i]>low){
                low = weights[i];
            }
            high += weights[i];
        }
        int ans = high;
        while(low<=high){
            int mid = low + (high-low)/2;
            int reqDays = computeReqDays(weights, mid);
            if(reqDays<=days){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public int computeReqDays(int weights[], int mid){
        int sum = 0;
        int days = 1;
        for(int i=0; i<weights.length; i++){
            if(sum+weights[i] > mid){
                days++;
                sum = 0;
            }
            sum += weights[i];
        }
        return days;
    }
}