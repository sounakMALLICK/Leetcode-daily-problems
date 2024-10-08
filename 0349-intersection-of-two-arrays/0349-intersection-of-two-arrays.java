class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            map.put(nums1[i],1);
        }
        for(int i=0; i<nums2.length; i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])==1){
                list.add(nums2[i]);
                map.put(nums2[i],0);
            }
        }
        int ans[] = new int[list.size()];
        for(int i=0; i<ans.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}