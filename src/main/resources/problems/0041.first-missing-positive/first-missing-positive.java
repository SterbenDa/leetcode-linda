class Solution {
    private static final int E = -1;

    /**
     * 标准参考答案
     */
    public int firstMissingPositive(int[] nums) {
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
}