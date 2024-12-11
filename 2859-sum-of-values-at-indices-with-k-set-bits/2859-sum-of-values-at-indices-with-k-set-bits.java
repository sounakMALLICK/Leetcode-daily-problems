class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i=0; i<nums.size(); i++){
            int count=0;
            for(int j=0; j<32; j++){
                if(isSetBit(i, j)){
                    count++;
                }
            }
            if(count==k){
                sum += nums.get(i);
            }
        }
        return sum;
    }
    public boolean isSetBit(int n, int i){
        return (n & (1<<i)) != 0;
    }
}