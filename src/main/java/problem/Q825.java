package problem;

/**
 * @author linda
 * @create 2019-04-16-18:26
 **/
class Q825 {

    int numFriendRequests(int[] ages) {
        int result = 0;
        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages.length; j++) {
                if (i == j
                        || ages[i] <= 0.5 * ages[j] + 7
                        || ages[i] > ages[j]
                        || (ages[i] > 100 && ages[j] < 100)) {
                    continue;
                }
                result++;
            }
        }
        return result;
    }

    // TLE
//    int numFriendRequests(int[] ages) {
//        int result = 0;
//        for (int i = 0; i < ages.length; i++) {
//            for (int j = 0; j < ages.length; j++) {
//                if (i == j
//                        || ages[i] <= 0.5 * ages[j] + 7
//                        || ages[i] > ages[j]
//                        || (ages[i] > 100 && ages[j] < 100)) {
//                    continue;
//                }
//                result++;
//            }
//        }
//        return result;
//    }
}
