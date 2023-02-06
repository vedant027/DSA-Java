public class CheckiftheSentenceIsPangram {
    public static void main(String[] args) {
        class Solution {
            public boolean checkIfPangram(String sentence) {
                for (int i = 0; i < 26; ++i) {
                    char currChar = (char)('a' + i);

                    if (sentence.indexOf(currChar) == -1)
                        return false;
                }
                return true;
            }
        }
    }
}