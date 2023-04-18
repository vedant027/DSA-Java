public class Sqrtx {
    public static void main(String[] args) {
        class Solution {
            public int mySqrt(int x) {

                x = (int)Math.sqrt(x);
                int result = (int)Math.floor(x);
                return result;

            }
        }
    }
}
