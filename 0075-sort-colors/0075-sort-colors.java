class Solution {
    public void sortColors(int[] nums) {
        int arr[] = new int[3];
        for(int i=0; i<nums.length; i++){
            arr[nums[i]]++;
        }
        int k = 0;
        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            for(int j=0; j<element; j++){
                nums[k++] = i;
            }
        }
    }
}