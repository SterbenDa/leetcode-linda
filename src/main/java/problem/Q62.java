package problem;

/**
 * 解题思路：dp
 * 当前格子为上面的格子和左边格子之和
 * map[m][n] = map[m][n-1] + map[m-1][n]
 *
 * @author linda
 * @create 2019-04-24-23:43
 **/
class Q62 {

    /**
     * FIXME: 有更好的解法
     * <p>
     * O(min(n,m)) time, O(1) space
     */
//    int uniquePaths(int m, int n) {
//        // Reduce to compute the combination formula: C(m+n-2, m-1)
//        --m;
//        --n;
//
//        int min = m > n ? n : m;
//
//        unsigned long long x = 1;
//        unsigned long long y = 1;
//
//        for (int i = 2; i <= min; i++)
//            y *= i;
//
//        for (int i = m+n; min > 0; min--, i-- )
//            x *= i;
//
//        return x/y;
//    }

    int uniquePaths(int m, int n) {
        int[][] dp = new int[n][m];
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // left
                if (j - 1 >= 0) {
                    dp[i][j] += dp[i][j - 1];
                }
                // top
                if (i - 1 >= 0) {
                    dp[i][j] += dp[i - 1][j];
                }
            }
        }
        return dp[n - 1][m - 1];
    }
}
