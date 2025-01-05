class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int arr[] = new int[s.length()];
        for(int i=0; i<shifts.length; i++){
            int start = shifts[i][0];
            int end = shifts[i][1];
            int dir = shifts[i][2];

            if(dir==0){
                arr[start]--;
                if(end+1<arr.length){
                    arr[end+1]++;
                }
            }
            else{
                arr[start]++;
                if(end+1<arr.length){
                    arr[end+1]--;
                }
            }
        }
        char ch[] = s.toCharArray();
        int x = 0;
        for(int i=0; i<s.length(); i++){
            x += arr[i];
            ch[i] = shift(ch[i],x);
        }
        return String.valueOf(ch);
    }
    public char shift(char ch, int shiftVal){
        int ans = ch + shiftVal;
        if(shiftVal<0){
            if(ans>=97){
                return (char)ans;
            }
            else{
                ans = 97%ans;
                return (char)('z'-ans+1);
            }
        }
        else{
            if(ans<=122){
                return (char)ans;
            }
            else{
                ans %= 122;
                return (char)('a'+ans-1);
            }
        }
    }
}