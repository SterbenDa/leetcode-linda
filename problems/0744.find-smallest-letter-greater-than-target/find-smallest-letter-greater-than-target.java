class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
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