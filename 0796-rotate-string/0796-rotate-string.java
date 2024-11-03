class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.length()!=s.length()){
            return false;
        }
        String str = goal + goal;
        return str.contains(s);
    }
}