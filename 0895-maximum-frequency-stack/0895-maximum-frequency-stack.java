class FreqStack {

    HashMap<Integer, Integer> freqMap;
    HashMap<Integer, Stack<Integer>> stackMap;
    int maxFreq;

    public FreqStack() {
        freqMap = new HashMap<>();
        stackMap = new HashMap<>();
        maxFreq = 0;
    }
    
    public void push(int val) {
        int f = freqMap.getOrDefault(val,0);
        f++;
        freqMap.put(val, f);

        if(!stackMap.containsKey(f)){
            maxFreq++;
            stackMap.put(f, new Stack<>());
        }
        stackMap.get(f).push(val);
    }
    
    public int pop() {
        int ans = stackMap.get(maxFreq).pop();
        int f = freqMap.get(ans);
        f--;
        freqMap.put(ans, f);
        if(stackMap.get(maxFreq).size()==0){
            stackMap.remove(maxFreq);
            maxFreq--;
        }
        return ans;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */