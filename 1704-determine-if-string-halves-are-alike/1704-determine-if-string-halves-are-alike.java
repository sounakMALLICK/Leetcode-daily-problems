class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int length = s.length();
        int count = 0;
        for(int i=0; i<length/2; i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(isVowel(s.charAt(i+(length/2)))){
                count--;
            }
        }
        return count==0;
    }
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}