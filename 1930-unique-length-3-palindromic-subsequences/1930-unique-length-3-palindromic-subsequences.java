class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int count=0;
        Set<Character> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(s.charAt(i));
        }

        for(char ch : set){
            int i=-1, j=-1;
            for(int k=0; k<n; k++){
                if(ch==s.charAt(k)){
                    if(i==-1){
                        i=k;
                    }
                    j=k;
                }
            }
            if(i!=j){
                Set<Character> set1 = new HashSet<>();
                for(int k=i+1; k<j; k++){
                    set1.add(s.charAt(k));
                }
                count += set1.size();
            }
        }
        return count;
    }
}