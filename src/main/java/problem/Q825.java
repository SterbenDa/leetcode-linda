package problem;

import java.util.HashMap;
import java.util.Map;

/**
 * 解题思路：
 * 先对数据进行处理，标记成年龄->数量,然后枚举，
 * 如果满足条件：
 * 1.若年龄相同，如果只有1个则跳过（自己），否则就是该年龄有顺序的n人里取2个（排列A(m,n)）
 * 2.若年龄不相同，则两两有关系，相乘就行了
 *
 * @author linda
 * @create 2019-04-16-18:26
 **/
class Q825 {

    int numFriendRequests(int[] ages) {
        // key:age value:count
        Map<Integer, Integer> map = new HashMap<>(0);
        for (int age : ages) {
            int count = map.getOrDefault(age, 0);
            map.put(age, count + 1);
        }

        int result = 0;
        for (Map.Entry<Integer, Integer> entryA : map.entrySet()) {
            for (Map.Entry<Integer, Integer> entryB : map.entrySet()) {
                int ageA = entryA.getKey();
                int ageB = entryB.getKey();
                int countB = entryB.getValue();
                if (ageA == ageB && countB == 1) {
                    // 自己
                    continue;
                }
                if ((ageA <= 0.5 * ageB + 7)
                        || (ageA > ageB)
                        || (ageA > 100 && ageB < 100)) {
                    // 不符合条件
                    continue;
                }
                if (ageA == ageB) {
                    // 相同年龄，符合条件则两两都符合，A(2,n)
                    int mutli = 1;
                    for (int i = countB; i >= (countB - 2 + 1); i--) {
                        mutli *= i;
                    }
                    result += mutli;
                    continue;
                }
                // ageA:countA
                // ageB:countB
                // N:N关系
                int countA = entryA.getValue();
                result += countA * countB;
            }
        }
        return result;
    }

    /**
     * TLE
     */
    int numFriendRequests2(int[] ages) {
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
}
