class Solution {
    public void swap(int arr1[], int left, int arr2[], int right){
        if(arr1[left] > arr2[right]){
            int temp = arr1[left];
            arr1[left] = arr2[right];
            arr2[right] = temp;
        }
    }
    public void mergeTwoArrays(int arr1[], int m, int arr2[], int n){
        int length = m+n;
        int gap = (length/2) + (length%2);
        while(gap>0){
            int left=0;
            int right=gap+left;
            while(right<length){
                if(left<m && right>=m)
                swap(arr1, left, arr2, right-m);
                else if(left>=m)
                swap(arr2, left-m, arr2, right-m);
                else
                swap(arr1, left, arr1, right);

                left++;
                right++;
            }
            if(gap==1)
            break;

            gap = (gap/2)+(gap%2);
        }
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int temp[] = new int[m+n];
        mergeTwoArrays(nums1, m, nums2, n);
        for(int i=0; i<m+n; i++){
            if(i<m){
                temp[i] = nums1[i];
            }
            else{
                temp[i] = nums2[i-m];
            }
        }
        if((m+n)%2 == 1){
            int idx = (int) Math.floor((m+n)/2);
            return (double) temp[idx];
        }
        else{
            int idx = (m+n)/2;
            return (double)(temp[idx]+temp[idx-1])/2;
        }
    }
}