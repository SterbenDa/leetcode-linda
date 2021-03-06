package problem;

/**
 * @author linda
 * @create 2019-04-18-10:56
 **/
class Q766 {

    boolean isToeplitzMatrix(int[][] matrix) {
        // m:行，n列
        int m = matrix.length;
        int n = matrix[0].length;

        /* check
          | X X |
          | 0 X |
         */
        for (int x = 0, y = 0; y < n - 1; y++) {
            int num = matrix[x][y];
            for (int i = x + 1, j = y + 1; i < m && j < n; i++, j++) {
                if (num != matrix[i][j]) {
                    return false;
                }
            }
        }

        /* check
          | X 0 |
          | X X |
         */
        for (int x = 1, y = 0; x < m - 1; x++) {
            int num = matrix[x][y];
            for (int i = x + 1, j = y + 1; i < m && j < n; i++, j++) {
                if (num != matrix[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}