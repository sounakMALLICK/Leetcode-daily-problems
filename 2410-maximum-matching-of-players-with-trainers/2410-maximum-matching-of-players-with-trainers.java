class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int ans = 0;
        mergeSort(trainers, 0, trainers.length-1);
        mergeSort(players, 0, players.length-1);

        int i=0, j=0;
        while(i<players.length){
            if(j<trainers.length){
                if(players[i]<=trainers[j]){
                    ans++;
                    i++;
                    j++;
                }
                else{
                    j++;
                }
            }
            else{
                break;
            }
        }
        return ans;
    }
    public void mergeSort(int arr[], int start, int end){
        if(start==end){
            return;
        }
        int mid = start + (end-start)/2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }
    public void merge(int arr[], int s, int m, int e){
        int temp[] = new int[e-s+1];

        int p1=s, p2=m+1;
        int p3=0;

        while(p1<=m && p2<=e){
            if(arr[p1]<arr[p2]){
                temp[p3++] = arr[p1++];
            }
            else{
                temp[p3++] = arr[p2++];
            }
        }
        
        while(p1<=m){ temp[p3++] = arr[p1++]; }
        while(p2<=e){ temp[p3++] = arr[p2++]; }

        int i=0;
        for(int j=s; j<=e; j++){
            arr[j] = temp[i++];
        }
    }
}