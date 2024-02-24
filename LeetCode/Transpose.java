// Link : https://leetcode.com/problems/transpose-matrix/description/
// Description : Transpose Matrix

public class Transpose {
    static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] transposed = new int[n][m];
        
        for (int i = 0; i < m; i++) 
            for (int j = 0; j < n; j++) 
                transposed[j][i] = matrix[i][j];
        
        return transposed;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        mat = transpose(mat);
        for(int[] i: mat){
            for(int j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
