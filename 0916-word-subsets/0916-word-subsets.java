class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int maxFreq[] = new int[26];
        for(int i=0; i<words2.length; i++){
            int currFreq[] = getFreq(words2[i]);
            for(int j=0; j<26; j++){
                maxFreq[j] = Math.max(maxFreq[j],currFreq[j]);
            }
        }
        List<String> ans = new ArrayList<>();
        for(int i=0; i<words1.length; i++){
            int currFreq[] = getFreq(words1[i]);
            boolean flag = true;
            for(int j=0; j<26; j++){
                if(currFreq[j]<maxFreq[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                ans.add(words1[i]);
            }
        }
        return ans;
    }
    
    public int[] getFreq(String s){
        int count[] = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
        }
        return count;
    }
    
}