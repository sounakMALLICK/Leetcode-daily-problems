class Solution {
    public int numberOfBeams(String[] bank) {
        int m = bank.length;
        int n = bank[0].length();

        int ans = 0;
        int prev = 0;
        for(int i=0; i<m; i++){
            int curr = 0;
            for(int j=0; j<n; j++){
                if(bank[i].charAt(j)=='1'){
                    curr++;
                }
            }
            if(curr!=0){
                ans += (prev*curr);
                prev = curr;
            }
        }
        return ans;
    }
}