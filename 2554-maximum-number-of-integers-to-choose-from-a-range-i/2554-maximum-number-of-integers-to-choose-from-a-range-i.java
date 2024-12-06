class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<banned.length; i++){
            set.add(banned[i]);
        }
        int count = 0;
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(!set.contains(i)){
                sum += i;
                if(sum<=maxSum){
                    count++;
                }
            }
        }
        return count;
    }
}