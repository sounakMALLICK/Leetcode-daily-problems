class Solution {
    public String defangIPaddr(String address) {
        Stack<Character> stack = new Stack<>();
        int i=0;
        while(i<address.length()){
            if(address.charAt(i)=='.'){
                stack.add('[');
                stack.add('.');
                stack.add(']');
                i++;
            }
            else{
                stack.add(address.charAt(i));
                i++;
            }
        }
        char arr[] = new char[stack.size()];
        for(int j=arr.length-1; j>=0; j--){
            arr[j] = stack.pop();
        }
        return new String(arr);
    }
}