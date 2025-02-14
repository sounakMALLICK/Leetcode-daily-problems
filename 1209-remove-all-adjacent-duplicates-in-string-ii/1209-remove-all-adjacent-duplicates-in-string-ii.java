class Solution {
    static class Pair{
        char ch;
        int n;
        Pair(char ch, int n){
            this.ch = ch;
            this.n = n;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(stack.isEmpty() || c!=stack.peek().ch){
                stack.push(new Pair(c, 1));
            }
            else{
                Pair rem = stack.pop();
                rem.n++;
                stack.push(rem);
                if(stack.peek().n == k){
                    stack.pop();
                }
            }
        } 
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            Pair rem = stack.pop();
            int n = rem.n;
            while(n-->0){
                sb.append(rem.ch);
            }
        } 
        return sb.reverse().toString();
    }
}