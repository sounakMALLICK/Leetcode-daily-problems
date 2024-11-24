class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        String str = "";
        backtrack(0, 0, n, str, ans);
        return ans;
    }
    public void backtrack(int openBraces, int closedBraces, int n, String str, List<String> ans){
        if(openBraces==n && closedBraces==n){
            ans.add(str);
            return;
        }
        if(openBraces < n){
            backtrack(openBraces+1, closedBraces, n, str+"(", ans);
        }
        if(closedBraces < openBraces){
            backtrack(openBraces, closedBraces+1, n, str+")", ans);
        }
    }
}