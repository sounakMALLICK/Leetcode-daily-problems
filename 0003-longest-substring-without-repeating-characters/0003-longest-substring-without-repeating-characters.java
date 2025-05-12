class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n<=1){
            return n;
        }
        int max=0;
        for(int i=0; i<n; i++){
            Set<Character> set = new HashSet<>();
            int count = 0;
            for(int j=i; j<n; j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                count++;
                set.add(s.charAt(j));
            }
            max = Math.max(count, max);
        }
        return max;
    }
}