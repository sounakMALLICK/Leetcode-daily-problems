class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int n = word.length();
        int i = 0;
        while(i<n){
            char ch = word.charAt(i);
            int count = 0;
            while(i<n && count<9 && ch==word.charAt(i)){
                i++;
                count++;
            }
            sb.append(count);
            sb.append(ch);
        }
        return sb.toString();
    }
}