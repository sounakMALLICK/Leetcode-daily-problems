class Solution {
    public int maxSumDivThree(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int sum = 0;
        for(int n : nums){
            sum += n;
            if(n%3==1){
                list1.add(n);
            }
            if(n%3==2){
                list2.add(n);
            }
        }
        if(sum%3==0){
            return sum;
        }
        Collections.sort(list1);
        Collections.sort(list2);

        int res = 0;
        int rem = sum%3; // 1 or 2
        if(rem==1){
            int remove1 = list1.size()>=1 ? list1.get(0) : Integer.MAX_VALUE;
            int remove2 = list2.size()>=2 ? list2.get(0)+list2.get(1) : Integer.MAX_VALUE;
            res = Math.max(res, sum - Math.min(remove1, remove2));
        }
        else{
            int remove1 = list2.size()>=1 ? list2.get(0) : Integer.MAX_VALUE;
            int remove2 = list1.size()>=2 ? list1.get(0)+list1.get(1) : Integer.MAX_VALUE;
            res = Math.max(res, sum - Math.min(remove1, remove2));
        }
        return res;
    }
}