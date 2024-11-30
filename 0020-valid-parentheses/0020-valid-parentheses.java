class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(st.size()==0 || ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(ch==')'){
                    if(st.peek()=='('){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
                else if(ch=='}'){
                    if(st.peek()=='{'){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
                else{
                    if(st.peek()=='['){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return st.size()==0;
    }
}