class Solution {
    public int partitionArray(int[] arr, int k) {
        Arrays.sort(arr);
        int count = 1;
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]-min<=k){
                continue;
            }
            else{
                count++;
                min = arr[i];
            }
        }
        return count;
    }
}