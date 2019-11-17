package problem;

/**
 * @author linda
 * @create 2019-11-17-21:41
 **/
class Q64 {

    /**
     * 下，右方向
     */
    private static final int[][] DIRECTION = {{-1, 0}, {0, -1}};

    /**
     * 广度优先
     * <p>
     * result[x][y] = min(result[x][y],result[x-1][y])
     * result[x][y] = min(result[x][y],result[x][y-1])
     */
    int minPathSum(int[][] grid) {
        int yLength = grid[0].length;
        int xLength = grid.length;
        int[][] result = new int[xLength + 1][yLength + 1];
        for (int i = 0; i < xLength; i++) {
            for (int j = 0; j < yLength; j++) {
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < 2; k++) {
                    int x = i + DIRECTION[k][0];
                    int y = j + DIRECTION[k][1];
                    if (x < 0 || y < 0) {
                        continue;
                    }
                    min = Math.min(min, result[x][y]);
                }
                min = (min == Integer.MAX_VALUE) ? 0 : min;
                result[i][j] = min + grid[i][j];
            }
        }
        return result[xLength - 1][yLength - 1];
    }
}
