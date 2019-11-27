package problem;

/**
 * @author linda
 * @create 2019-11-27-22:45
 **/
class Q1266 {

    int minTimeToVisitAllPoints(int[][] points) {
        if (points.length <= 1) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < points.length - 1; i++) {
            result += Math.max(
                    Math.abs(points[i][0] - points[i + 1][0]),
                    Math.abs(points[i][1] - points[i + 1][1])
            );
        }
        return result;
    }
}
