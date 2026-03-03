class Solution {
    public char findKthBit(int n, int k) {
        if(n==1){
            return '0';
        }
        String arr[] = new String[n];
        arr[0] = "0";
        for(int i=1; i<n; i++){
            String invert = invert(arr[i-1]);
            arr[i] = arr[i-1] + "1" + reverse(invert);
        }
        return arr[n-1].charAt(k-1);
    }
    public String invert(String str){
        char arr[] = str.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='0'){
                arr[i]='1';
            }
            else{
                arr[i]='0';
            }
        }
        return String.valueOf(arr);
    }
    public String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}