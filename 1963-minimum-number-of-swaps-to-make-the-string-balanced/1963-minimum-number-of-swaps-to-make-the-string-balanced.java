class Solution {
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.size()==0){
                    count++;
                }
                else{
                    stack.pop();
                }
            }
        }
        return count/2;
    }
}