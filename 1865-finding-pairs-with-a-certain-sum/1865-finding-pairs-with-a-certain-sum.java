class FindSumPairs {
    int nums1[];
    int nums2[];
    Map<Integer, Integer> map;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        map = new HashMap<>();
        for(int n : nums2){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
    }
    
    public void add(int index, int val) {
        map.put(nums2[index], map.get(nums2[index])-1);
        nums2[index] += val;
        map.put(nums2[index], map.getOrDefault(nums2[index], 0)+1);
    }
    
    public int count(int tot) {
        int c = 0;
        for(int i=0; i<nums1.length; i++){
            int r = tot-nums1[i];
            if(map.containsKey(r)){
                c+=map.get(r);
            }
        }
        return c;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */