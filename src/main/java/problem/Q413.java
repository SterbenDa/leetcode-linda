package problem;

/**
 * 解题思路：
 * 1：枚举选出每一串等差序列
 * 2：每一串序列符合要求的子序列的数量 能用公差为1的等差数列求和算出来
 * 等差数列求和公式：Sn = na1 + n(n-1)/2 * d
 * 如数列[1,2,3,4,5,6]，能构造出符合要求的序列数量是 4 + 3 + 2 + 1
 *
 * @author linda
 * @create 2019-11-29-18:15
 **/
class Q413 {

    int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length < 3) {
            return 0;
        }
        int length;
        int result = 0;
        for (int i = 0; i <= A.length - 3; ) {
            length = 2;
            int diff = A[i + 1] - A[i];
            for (int j = i + 2; j < A.length; j++) {
                if (A[j] != A[i] + (j - i) * diff) {
                    break;
                }
                length++;
            }
            int a1 = 1;
            int n = length - 3 + 1;
            result += n * a1 + n * (n - 1) / 2;

            if (length >= 3) {
                i += length;
            } else {
                i++;
            }
        }
        return result;
    }
}
