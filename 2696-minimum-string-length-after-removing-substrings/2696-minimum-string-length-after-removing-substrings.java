class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(stack.size()==0){
                stack.push(s.charAt(i));
            }
            else{
                if(s.charAt(i)=='B'){
                    if(stack.peek()=='A'){
                        stack.pop();
                    }
                    else{
                        stack.push(s.charAt(i));
                    }
                }
                else if(s.charAt(i)=='D'){
                    if(stack.peek()=='C'){
                        stack.pop();
                    }
                    else{
                        stack.push(s.charAt(i));
                    }
                }
                else{
                    stack.push(s.charAt(i));
                }
            }
        }
        return stack.size();
    }
}