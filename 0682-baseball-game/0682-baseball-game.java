class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for(int i=0; i<operations.length; i++){
            String str = operations[i];
            if(!str.equals("C") && !str.equals("D") && !str.equals("+")){
                int num = Integer.parseInt(str);
                stack.push(num);
                ans += num;
            }
            else if(str.equals("C")){
                int temp = stack.pop();
                ans -= temp;
            }
            else if(str.equals("D")){
                int temp = stack.peek()*2;
                stack.push(temp);
                ans += temp;
            }
            else{
                int temp = stack.pop();
                int sum = stack.peek()+temp;
                stack.push(temp);
                stack.push(sum);
                ans += sum;
            }
        }
        return ans;
    }
}