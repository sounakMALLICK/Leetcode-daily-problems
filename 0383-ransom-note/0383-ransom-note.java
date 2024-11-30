class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            char ch = magazine.charAt(i);
            if(!(map.containsKey(ch))){
                map.put(ch, 1);
            }
            else{
                map.put(ch, map.get(ch)+1);
            }
        }
        for(int i=0; i<ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            if(map.containsKey(ch)==false){
                return false;
            }
            else if(map.get(ch)<1){
                return false;
            }
            else{
                map.put(ch,map.get(ch)-1);
            }
        }
        return true;
    }
}