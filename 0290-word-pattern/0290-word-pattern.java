class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0; i<words.length; i++){
            if(!map.containsKey(pattern.charAt(i))){
                map.put(pattern.charAt(i), words[i]);
                if(!(list.contains(words[i]))){
                    list.add(words[i]);
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