class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[] = new int[nums1.length];
        int p1=0, p2=0;
        int p3=0;
        while(p1<m && p2<n){
            if(nums1[p1]<nums2[p2]){
                temp[p3++] = nums1[p1++];
            }
            else{
                temp[p3++] = nums2[p2++];
            }
        }
        while(p1<m){
            temp[p3++] = nums1[p1++];
        }
        while(p2<n){
            temp[p3++] = nums2[p2++];
        }

        for(int i=0; i<nums1.length; i++){
            nums1[i] = temp[i];
        }
    }
}