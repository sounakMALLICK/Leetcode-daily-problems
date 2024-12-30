class MinStack {

    Stack<Long> stack;
    long min;
    public MinStack() {
        stack = new Stack<>();
        min = 0;
    }
    
    public void push(int val) {
        if(stack.size()==0){
            stack.push(min);
            min = val;
            return;
        } 
        long addVal = val-min;
        stack.push(addVal);
        if(val<min){
            min = val;
        }
    }
    
    public void pop() {
        long rem = stack.pop();
        if(rem<0){
            min -= rem;
        }
    }
    
    public int top() {
        long peek = stack.peek();
        if(peek<0){
            long val = min;
            return (int)val;
        }
        else{
            long val = min+peek;
            return (int)val;
        }
    }
    
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */