package problem;

import java.util.HashMap;
import java.util.Map;

/**
 * 1：暴力
 * 2：sort O(nlogn)
 * 3：my O(n)（和题解一样）
 * <p>
 * 有坑，相同数字不管，也符合条件，如1,2,2,3也符合，所以可以去重
 *
 * @author linda
 * @create 2019-04-23-17:29
 **/
class Q128 {

    int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Map<Integer, Boolean> intMap = new HashMap<>(nums.length);
        for (int num : nums) {
            intMap.put(num, true);
        }
        int result = 1;
        for (int num : nums) {
            if (!intMap.containsKey(num)) {
                continue;
            }
            int sum = 1;
            // left
            for (int i = num - 1; intMap.containsKey(i); i--) {
                sum++;
                intMap.remove(i);
            }
            // right
            for (int i = num + 1; intMap.containsKey(i); i++) {
                sum++;
                intMap.remove(i);
            }
            intMap.remove(num);
            result = Math.max(result, sum);
        }
        return result;
    }
}
