class Solution {
    private static final int E = -1;

    /**
     * ��׼�ο���
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
                    // ֱ��������滻��������Ч�������������Ѿ�����ȷλ��Ϊֹ
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