class Solution {
    public String restoreString(String s, int[] indices) {
        char ans[] = new char[indices.length];
        for(int i=0; i<indices.length; i++){
            int j = indices[i];
            ans[j] = s.charAt(i);
        }
        return "".valueOf(ans);
    }
}