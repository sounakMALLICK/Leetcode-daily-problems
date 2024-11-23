class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int pivot=-1;
        for(int i=n-1; i>0; i--){
            if(arr[i-1]<arr[i]){
                pivot = i-1;
                break;
            }
        }
        if(pivot==-1){
            reverse(arr, 0, n-1);
        }
        else{
            for(int i=n-1; i>pivot; i--){
                if(arr[pivot]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[pivot];
                    arr[pivot] = temp;
                    break;
                }
            }
            reverse(arr, pivot+1, n-1);
        }
    }
    public void reverse(int arr[], int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}