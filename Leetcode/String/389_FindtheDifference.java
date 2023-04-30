public class FindtheDifference {
    public static void main(String[] args) {
        class Solution {
            public char findTheDifference(String s, String t) {
                String word = s+t;
                int n = 0;

                for(int i=0; i<word.length(); i++) {
                    n = n ^ word.charAt(i);
                }
                return (char)n;
            }
        }
    }
}