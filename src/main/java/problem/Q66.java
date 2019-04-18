package problem;

/**
 * @author linda
 * @create 2019-04-18-11:34
 **/
class Q66 {

    int[] plusOne(int[] digits) {
        int add = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + add >= 10) {
                add = digits[i] + add - 9;
                digits[i] = 0;
                continue;
            }
            digits[i] += add;
            add = 0;
            break;
        }
        if (add > 0) {
            // 还有进位
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = add;
            if (digits.length - 1 >= 0) {
                System.arraycopy(digits, 0, newDigits, 1, digits.length - 1);
            }
            return newDigits;
        }
        return digits;
    }
}
