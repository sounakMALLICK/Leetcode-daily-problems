class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            Set<Character> set = new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[i][j]=='.'){
                    continue;
                }
                else if(set.contains(board[i][j])){
                    return false;
                }
                set.add(board[i][j]);
            }
        }
        for(int i=0; i<9; i++){
            Set<Character> set = new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[j][i]=='.'){
                    continue;
                }
                else if(set.contains(board[j][i])){
                    return false;
                }
                set.add(board[j][i]);
            }
        }
        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3){
                Set<Character> set = new HashSet<>();
                for(int s=i; s<i+3; s++){
                    for(int e=j; e<j+3; e++){
                        if(board[s][e]=='.'){
                            continue;
                        }
                        else if(set.contains(board[s][e])){
                            return false;
                        }
                        set.add(board[s][e]);
                    }
                }
            }
        }
        return true;
    }
}