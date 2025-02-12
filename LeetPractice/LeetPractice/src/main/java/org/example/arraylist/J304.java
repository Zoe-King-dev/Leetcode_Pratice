package org.example.arraylist;

/**
 * @Author Haoran_Yang
 * @Date 2025 01 11 22 53
 **/
class NumMatrix {

    private int[][] preSum;
    public NumMatrix(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        if (n == 0 || m == 0)
            return;
        preSum = new int[n + 1][m + 1];
        for (int i = 1; i < n + 1; i ++) {
            for (int j = 1; j < m + 1; j ++) {
                preSum[i][j] = preSum[i - 1][j] + preSum[i][j - 1] -preSum[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }
    }
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return preSum[row2 + 1][col2 + 1] - preSum[row2 + 1][col1] - preSum[row1][col2 + 1] + preSum[row1][col1];
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {3,0,1,4,2},
                {5,6,3,2,1},
                {1,2,0,1,5},
                {4,1,0,1,7},
                {1,0,3,0,5}
        };
        NumMatrix numMatrix = new NumMatrix(matrix);
        //[2,1,4,3],[1,1,2,2],[1,2,2,4]
        System.out.println(numMatrix.sumRegion(2, 1, 4, 3));
    }


}
