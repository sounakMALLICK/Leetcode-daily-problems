class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int ans[] = new int[n];
        if(k==0){
            Arrays.fill(ans,0);
        }
        else if(k>0){
            for(int i=0; i<n; i++){
                int sum=0, c=1, j=i+1;
                while(c<=k){
                    if(j==n){
                        j=0;
                    }
                    sum += code[j];
                    c++;
                    j++;
                }
                ans[i] = sum;
            }
        }
        else{
            for(int i=0; i<n; i++){
                int sum=0, c=1, j=i-1;
                while(c<=Math.abs(k)){
                    if(j==-1){
                        j=n-1;
                    }
                    sum += code[j];
                    c++;
                    j--;
                }
                ans[i] = sum;
            }
        }
        return ans;
    }
}