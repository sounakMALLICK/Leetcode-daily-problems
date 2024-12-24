class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;   

        int low = 0;
        int high = m;
        int total = m+n;

        while(low<=high){
            int mid1 = low + (high-low)/2;
            int mid2 = (total+1)/2 - mid1;

            int n1m1 = (mid1==0) ? Integer.MIN_VALUE : nums1[mid1-1];
            int n1m = (mid1==m) ? Integer.MAX_VALUE : nums1[mid1];
            int n2m1 = (mid2==0) ? Integer.MIN_VALUE : nums2[mid2-1];
            int n2m = (mid2==n) ? Integer.MAX_VALUE : nums2[mid2];

            if(n1m1 <= n2m && n2m1 <= n1m){
                if(total%2==0){
                    double lmax = Math.max(n1m1, n2m1);
                    double rmin = Math.min(n1m, n2m);
                    return (lmax + rmin)/2;
                }
                else{
                    return Math.max(n1m1, n2m1);
                }
            }
            else if(n1m1 > n2m){
                high = mid1-1;
            }
            else if(n2m1 > n1m){
                low = mid1+1;
            }
        }
        return 0.0;
    }
}