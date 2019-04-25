package problem;

/**
 * FIXME: 题目有问题
 *
 * @author linda
 * @create 2019-04-25-10:56
 **/
class Q516 {

    int longestPalindromeSubseq(String s) {
        int result = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            // 奇数回文
            int sum = 1;
            int left = (i - 1 + length) % length;
            int right = (i + 1 + length) % length;
            for (; left != right; left = (left - 1 + length) % length,
                    right = (right + 1 + length) % length) {
                if (s.charAt(left) != s.charAt(right)) {
                    break;
                }
                sum += 2;
                if (sum >= length) {
                    return length;
                }
            }
            result = Math.max(result, sum);

            // 偶数回文
            if (i + 1 < length && s.charAt(i) == s.charAt(i + 1)) {
                sum = 2;
                left = (i - 1 + length) % length;
                right = (i + 2 + length) % length;
                for (; left != right; left = (left - 1 + length) % length,
                        right = (right + 1 + length) % length) {
                    if (s.charAt(left) != s.charAt(right)) {
                        break;
                    }
                    sum += 2;
                    if (sum >= length) {
                        return length;
                    }
                }
                result = Math.max(result, sum);
            }
        }
        return result;
    }
}
