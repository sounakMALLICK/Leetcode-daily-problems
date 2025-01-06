class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int ans[] = new int[n];
        //for index = 0
        for(int j=1; j<n; j++){
            if(boxes.charAt(j)=='1'){
                ans[0] += j;
            }
        }
        //for index from 1 to n-2
        for(int i=1; i<n-1; i++){
            int count=0;
            //answer from 0 to i-1
            for(int j=0; j<i; j++){
                if(boxes.charAt(j)=='1'){
                    count += (i-j);
                }
            }
            //answer from i+1 to n-1
            for(int j=i+1; j<n; j++){
                if(boxes.charAt(j)=='1'){
                    count += (j-i);
                }
            }
            ans[i] = count;
        }
        //for index = n-1
        for(int j=0; j<n-1; j++){
            if(boxes.charAt(j)=='1'){
                ans[n-1] += (n-1-j);
            }
        }
        return ans;
    }
}