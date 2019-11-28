package problem;

/**
 * @author linda
 * @create 2019-11-28-22:00
 **/
class Q1252 {

    int oddCells(int n, int m, int[][] indices) {
        int result = 0;
        int[][] matrix = new int[n][m];
        for (int i = 0; i < indices.length; i++) {
            int x = indices[i][0];
            for (int j = 0; j < m; j++) {
                matrix[x][j] += 1;
            }
            int y = indices[i][1];
            for (int j = 0; j < n; j++) {
                matrix[j][y] += 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] % 2 == 1) {
                    result += 1;
                }
            }
        }
        return result;
    }
}
