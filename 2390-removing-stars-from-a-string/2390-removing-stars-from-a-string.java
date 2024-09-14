class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='*'){
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
            }
        }
        char[] ans= new char[stack.size()];
        for(int i=ans.length-1; i>=0; i--){
            ans[i] = stack.pop();
        }
        return String.valueOf(ans);
    }
}