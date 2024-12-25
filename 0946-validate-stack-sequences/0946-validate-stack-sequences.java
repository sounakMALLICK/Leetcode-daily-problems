class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i=0, j=0;
        while(i<pushed.length && j<popped.length){
            if(stack.size()==0){
                stack.push(pushed[i]);
                i++;
            }
            else if(stack.peek()==popped[j]){
                stack.pop();
                j++;
            }
            else{
                stack.push(pushed[i]);
                i++;
            }
        }
        while(j<popped.length && stack.peek()==popped[j]){
            stack.pop();
            j++;
        }
        return stack.size()==0;
    }
}