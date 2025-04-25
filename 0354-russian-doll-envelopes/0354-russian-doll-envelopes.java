class Solution {
    static class Pair implements Comparable<Pair>{
        int w;
        int h;
        Pair(int w, int h){
            this.w = w;
            this.h = h;
        }
        public int compareTo(Pair obj){
            if(this.w != obj.w){
                return this.w-obj.w;
            }
            else{
                return obj.h-this.h;
            }
        }
    }
    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;
        Pair arr[] = new Pair[n];
        for(int i=0; i<n; i++){
            arr[i] = new Pair(envelopes[i][0], envelopes[i][1]);
        }
        Arrays.sort(arr);

        int dp[] = new int[n];
        int ans = 0;
        for(int i=0; i<n; i++){
            int low = 0;
            int high = ans;
            while(low<high){
                int mid = low + (high-low)/2;
                if(dp[mid]<arr[i].h){
                    low = mid+1;
                }
                else{
                    high = mid;
                }
            }
            dp[low] = arr[i].h;
            if(low==ans){
                ans++;
            }
        }
        return ans;
    }
}