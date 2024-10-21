class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int length = s.length();
        String a = s.substring(0, length/2);
        String b = s.substring(length/2, length);
        int countA = 0, countB = 0;
        for(int i=0; i<a.length(); i++){
            if(isVowel(a.charAt(i))){
                countA++;
            }
            if(isVowel(b.charAt(i))){
                countB++;
            }
        }
        return countA==countB;
    }
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}