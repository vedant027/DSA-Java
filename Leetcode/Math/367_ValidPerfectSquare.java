public class ValidPerfectSquare {
    public static void main(String[] args) {
        class Solution {
            public boolean isPerfectSquare(int num) {
                int n = (int)Math.sqrt(num);
                if(n*n == num){
                    return true;
                }
                return false;
            }
        }
    }
}
