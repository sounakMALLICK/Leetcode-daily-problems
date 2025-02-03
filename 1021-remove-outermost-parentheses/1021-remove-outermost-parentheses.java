class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                if(stack.size()>0){
                    ans.append(s.charAt(i));
                }
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
                if(stack.size()>0){
                    ans.append(s.charAt(i));
                }
            }
        }
        return ans.toString();
    }
}