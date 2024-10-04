class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        int count=0;
        for(int i=0; i<message.length; i++){
            for(int j=0; j<bannedWords.length; j++){
                if(message[i].equals(bannedWords[j])){
                    count++;
                }
            }
            if(count>1){
                return true;
            }
        }
        return false;
    }
}