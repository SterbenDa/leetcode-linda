class Solution {
    public int maxSubArray(int[] nums) {
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
}