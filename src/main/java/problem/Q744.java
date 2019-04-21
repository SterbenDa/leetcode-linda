package problem;

/**
 * @author linda
 * @create 2019-04-21-21:48
 **/
class Q744 {

    char nextGreatestLetter(char[] letters, char target) {
        if (target >= letters[letters.length - 1]) {
            return letters[0];
        }
        for (char letter : letters) {
            if (letter > target) {
                return letter;
            }
        }
        return 'a';
    }
}
