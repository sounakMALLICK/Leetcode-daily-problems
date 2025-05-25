class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        int ans = 0;
        for(int i=0; i<words.length; i++){
            String rev = words[i].charAt(1)+""+words[i].charAt(0);
            if(map.containsKey(rev) && map.get(rev)>0){
                ans += 4;
                map.put(rev, map.get(rev)-1);
            }
            else{
                map.put(words[i], map.getOrDefault(words[i],0)+1);
            }
        }
        for(int i=0; i<words.length; i++){
            if(words[i].charAt(0)==words[i].charAt(1) && map.get(words[i])>0){
                ans += 2;
                break;
            }
        }
        return ans;
    }
}