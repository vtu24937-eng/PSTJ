
 It is best solved using 2D Prefix Sum (Summed-Area Table) for efficiency.

Brute force would be O(m × n × k²) which is too slow.
Using prefix sum, we can reduce it to O(m × n).

Key Idea (2D Prefix Sum)

We create a prefix sum matrix where:

prefix[i][j] = sum of all elements from (0,0) to (i-1,j-1)

Then each block sum can be computed in O(1) time.


CODE :


class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        
        int[][] prefix = new int[m + 1][n + 1];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                prefix[i+1][j+1] = mat[i][j]
                    + prefix[i][j+1]
                    + prefix[i+1][j]
                    - prefix[i][j];
            }
        }
        
        int[][] answer = new int[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int r1 = Math.max(0, i-k);
                int c1 = Math.max(0, j-k);
                int r2 = Math.min(m-1, i+k);
                int c2 = Math.min(n-1, j+k);
                
                answer[i][j] = prefix[r2+1][c2+1]
                    - prefix[r1][c2+1]
                    - prefix[r2+1][c1]
                    + prefix[r1][c1];
            }
        }
        
        return answer;
    }
}