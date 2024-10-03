class Solution {
    public int nextGreaterElement(int n) {
        char arr[] = (n+"").toCharArray();
        int idx = -1;
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            return -1;
        }
        char val = arr[idx];
        int smallIdx = idx+1;
        for(int i=idx+1; i<arr.length; i++){
            if(arr[i]>val &&  arr[i]<=arr[smallIdx]){
                smallIdx = i;
            }
        }
        char temp = arr[idx];
        arr[idx] = arr[smallIdx];
        arr[smallIdx] = temp;

        Arrays.sort(arr, idx+1, arr.length);
        long ans = Long.parseLong(new String(arr));
        if(ans>Integer.MAX_VALUE){
            return -1;
        }
        else{
            return (int) ans;
        }
    }
}