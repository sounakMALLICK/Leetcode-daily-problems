class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[] = new int[m+n];
        int p1=0, p2=0, t1=0;
        while(p1<m && p2<n){
            if(nums1[p1]<nums2[p2]){
                temp[t1++] = nums1[p1++];
            }
            else{
                temp[t1++] = nums2[p2++];
            }
        }
        while(p1<m){
            temp[t1++] = nums1[p1++];
        }
        while(p2<n){
            temp[t1++] = nums2[p2++];
        }
        int i=0;
        while(i<(m+n)){
            nums1[i] = temp[i];
            i++;
        }
    }
}