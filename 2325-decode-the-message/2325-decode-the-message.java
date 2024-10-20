class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        int ch = 97;
        for(int i=0; i<key.length(); i++){
            if(key.charAt(i)!=' '){
                if(!(map.containsKey(key.charAt(i)))){
                    map.put(key.charAt(i), (char) ch);
                    ch++;
                }
            }
        }
        String decodeMssg = "";
        for(int i=0; i<message.length(); i++){
            if(message.charAt(i)==' '){
                decodeMssg += message.charAt(i);
            }
            else{
                decodeMssg += map.get(message.charAt(i));
            }
        }
        return decodeMssg;
    }
}