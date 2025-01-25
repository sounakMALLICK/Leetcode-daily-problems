class Solution {
    public int calculate(String s) {
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();
        int i=0;
        int n = s.length();
        while(i<n){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                int num = 0;
                while(i<n && s.charAt(i)>='0' && s.charAt(i)<='9'){
                    num = num*10+(s.charAt(i)-'0');
                    i++;
                }
                operand.push(num);
                i--;
            }
            else if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/'){
                while(operator.size()>0 && precedence(operator.peek())>=precedence(s.charAt(i))){
                    int v2 = operand.pop();
                    int v1 = operand.pop();
                    char op = operator.pop();
                    operand.push(findVal(v1,v2,op));
                }
                operator.push(s.charAt(i));
            }
            i++;
        }
        while(operator.size()>0){
            int v2 = operand.pop();
            int v1 = operand.pop();
            char op = operator.pop();
            operand.push(findVal(v1,v2,op));
        }
        return operand.pop();
    }
    public int findVal(int v1, int v2, char op){
        if(op=='+'){
            return v1+v2;
        }
        else if(op=='-'){
            return v1-v2;
        }
        else if(op=='*'){
            return v1*v2;
        }
        else{
            return v1/v2;
        }
    }
    public int precedence(char op){
        if(op=='*' || op=='/'){
            return 1;
        }
        return 0;
    }
}