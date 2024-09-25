class NumMatrix {
    int prefSum[][];
    public NumMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        this.prefSum = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(j==0){
                    prefSum[i][j] = matrix[i][j];
                }
                else{
                    prefSum[i][j] = prefSum[i][j-1] + matrix[i][j];
                }
            }
        }
        for(int j=0; j<m; j++){
            for(int i=1; i<n; i++){
                prefSum[i][j] = prefSum[i-1][j]+prefSum[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        sum += prefSum[row2][col2];
        if(row1-1>=0){
            sum -= prefSum[row1-1][col2];
        }
        if(col1-1>=0){
            sum -= prefSum[row2][col1-1];
        }
        if(row1-1>=0 && col1-1>=0){
            sum += prefSum[row1-1][col1-1];
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */