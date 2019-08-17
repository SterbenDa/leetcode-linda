package problem;

/**
 * 解题思路：
 * 1：先求出前n个数的和，得出一个数组
 * 2：前n个最长序列和就是当前数减去之前最小的序列和
 * 时间复杂度：O(n)
 *
 * @author linda
 * @create 2019-08-17-22:11
 **/
class Q53 {

    /**
     * 优化成一个循环
     */
    int maxSubArray(int[] nums) {
        int sum = 0;
        // 前n个数的最小和
        int preMinSum = 0;

        int result = Integer.MIN_VALUE;
        for (int num : nums) {
            sum += num;
            result = Math.max(result, sum - preMinSum);
            preMinSum = Math.min(preMinSum, sum);
        }
        return result;
    }

    int maxSubArray1(int[] nums) {
        int size = nums.length;
        int[] sum = new int[size + 1];

        sum[0] = 0;
        for (int i = 1; i <= size; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }

        // 前n个数的最小和
        int preMinSum = sum[0];
        int result = Integer.MIN_VALUE;
        for (int i = 1; i <= size; i++) {
            result = Math.max(result, sum[i] - preMinSum);
            preMinSum = Math.min(preMinSum, sum[i]);
        }
        return result;
    }
}
