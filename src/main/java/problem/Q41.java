package problem;

import java.util.HashSet;
import java.util.Set;

/**
 * 解题思路：
 * 1.my:HashSet O(n)空间，O(n)时间
 * 2.best: O(1)空间，O(n)时间
 * ->利用数组下标标记num[i]=i+1，
 * ->若数的值[大于数组长度的]或[小于等于0的]标记成-1（舍弃）
 *
 * @author linda
 * @create 2019-04-24-19:51
 **/
class Q41 {

    private static final int E = -1;

    /**
     * 标准参考答案
     */
    int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0 || nums[i] > nums.length) {
                nums[i] = E;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != E && nums[i] != i + 1) {
                int v = nums[i];
                nums[i] = E;
                while (v != E && v != nums[v - 1]) {
                    // 直到这个被替换的数是无效数或者它本身已经在正确位置为止
                    int t = nums[v - 1];
                    nums[v - 1] = v;
                    v = t;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == E) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }

    /**
     * 我最开始的答案
     */
    int firstMissingPositive1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; ; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
    }
}
