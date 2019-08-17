package problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author linda
 * @create 2019-04-26-19:12
 **/
class Q1027 {

    int longestArithSeqLength(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : A) {
            // 去重
            set.add(num);
        }
        int len = 0;
        for (int num : set) {
            A[len++] = num;
        }
        Arrays.sort(A, 0, len);
        int result = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                // 步长
                int step = A[j] - A[i];
                int sum = 2;

                System.err.print(A[i] + " " + A[j] + " ");

                for (int multi = 2; ; multi++) {
                    int val = A[i] + multi * step;
                    if (!set.contains(val)) {
                        result = Math.max(result, sum);
                        break;
                    }
                    System.err.print(val + " ");
                    sum++;
                }
                System.err.println();
            }
        }
        return result;
    }
}
