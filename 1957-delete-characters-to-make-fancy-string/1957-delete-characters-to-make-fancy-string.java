class Solution {
    public String makeFancyString(String s) {
        if(s.length()<=2){
            return s;
        }
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0)).append(s.charAt(1));
        for(int i=2; i<s.length(); i++){
            if(s.charAt(i)!=s.charAt(i-1) || s.charAt(i)!=s.charAt(i-2)){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}