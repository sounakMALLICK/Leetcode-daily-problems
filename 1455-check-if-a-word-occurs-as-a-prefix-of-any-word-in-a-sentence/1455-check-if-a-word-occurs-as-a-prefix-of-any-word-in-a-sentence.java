class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int n = searchWord.length();
        String str[] = sentence.split(" ");
        for(int i=0; i<str.length; i++){
            if(str[i].length()>=n && str[i].substring(0,n).equals(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}