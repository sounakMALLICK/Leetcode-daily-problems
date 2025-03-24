class Solution {
    public int countDays(int days, int[][] meetings) {
        boolean arr[] = new boolean[days];
        for(int i=0; i<meetings.length; i++){
            int s = meetings[i][0];
            int e = meetings[i][1];
            for(int j=s; j<=e; j++){
                if(arr[j-1]==false){
                    arr[j-1] = true;
                }
            }
        }
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==false){
                ans++;
            }
        }
        return ans;
    }
}