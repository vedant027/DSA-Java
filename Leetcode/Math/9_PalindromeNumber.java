public class PalindromeNumber {
    public static void main(String[] args) {
        class Solution {
            public boolean isPalindrome(int x) {
                int reversed = 0;
                int original = x;
                while(x != 0){
                    int num = x % 10;
                    reversed = reversed*10 + num;
                    x = x/10;
                }
                if(original >= 0 && original == reversed){
                    return true;
                }
                return false;
            }
        }
    }
}