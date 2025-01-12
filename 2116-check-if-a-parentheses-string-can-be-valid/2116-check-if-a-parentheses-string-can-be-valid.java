class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if(n%2==1){
            return false;
        }

        Stack<Integer> st = new Stack<>();
        Stack<Integer> unlocked = new Stack<>();

        for(int i=0; i<n; i++){
            if(locked.charAt(i)=='0'){
                unlocked.push(i);
            }
            else if(s.charAt(i)=='('){
                st.push(i);
            }
            else{
                if(st.size()>0){
                    st.pop();
                }
                else{
                    if(unlocked.size()>0){
                        unlocked.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        while(st.size()>0 && unlocked.size()>0 && st.peek()<unlocked.peek()){
            st.pop();
            unlocked.pop();
        }
        return (st.size()==0);
    }
}