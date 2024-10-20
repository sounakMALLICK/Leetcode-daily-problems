class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<String>();
        for(int i=0; i<words.length; i++){
            if(!map.containsKey(pattern.charAt(i))){
                map.put(pattern.charAt(i), words[i]);
                if(!(set.contains(words[i]))){
                    set.add(words[i]);
                }
                else{
                    return false;
                }
            }
            else{
                if(!(map.get(pattern.charAt(i)).equals(words[i]))){
                    return false;
                }
            }
        }
        return true;
    }
}