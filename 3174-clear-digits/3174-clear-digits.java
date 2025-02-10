class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        if(stack.size()==0){
            return "";
        }
        char ans[] = new char[stack.size()];
        for(int i=ans.length-1; i>=0; i--){
            ans[i] = stack.pop();
        }
        return String.valueOf(ans);
    }
}