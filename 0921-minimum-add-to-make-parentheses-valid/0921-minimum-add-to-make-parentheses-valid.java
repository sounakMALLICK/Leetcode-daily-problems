class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
                count++;
            }
            else if(stack.size()!=0 && s.charAt(i)==')'){
                stack.pop();
                count--;
            }
            else{
                count++;
            }
        }
        return count;
    }
}