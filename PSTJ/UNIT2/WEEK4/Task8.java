To transpose a matrix, you convert rows into columns.

If the matrix is m × n, the transpose will be n × m.
Approach
Get number of rows m and columns n
Create new matrix of size n x m
Swap indices:
transpose[j][i] = matrix[i][j]










CODE :

class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[][] result = new int[n][m];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                result[j][i] = matrix[i][j];
            }
        }
        
        return result;
    }
}