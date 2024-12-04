class Solution {
    public void wiggleSort(int[] nums) {
        int temp[] = new int[nums.length];
        for(int i=0; i<temp.length; i++){
            temp[i] = nums[i];
        }
        Arrays.sort(temp);
        int i=1, j=temp.length-1;
        while(i<nums.length){
            nums[i] = temp[j];
            i += 2;
            j--;
        }
        i=0;
        while(i<nums.length){
            nums[i] = temp[j];
            i += 2;
            j--;
        }
    }
}